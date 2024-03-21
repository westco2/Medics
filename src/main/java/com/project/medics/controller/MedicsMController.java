package com.project.medics.controller;

import com.project.medics.command.FlctnVO;
import com.project.medics.command.MdcnVO;
import com.project.medics.command.MdexmMVO;
import com.project.medics.mdexmM.service.MdexmMService;
import com.project.medics.util.CriteriaM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mdexmM")
public class MedicsMController {


    @Autowired
    @Qualifier("MdexmMService")
    private MdexmMService mService;


    @GetMapping("/adminM")
    public String adminM(Model model){
        model.addAttribute("week", mService.weekvi());
        model.addAttribute("mdcns", mService.mdcnbest());
        model.addAttribute("total", mService.totalInfo());

        return "mdexmM/adminM";
    }

    @GetMapping("/checkM")
    public String checkM(Model model, CriteriaM cri ){

        model.addAttribute("std", mService.getursInfo(cri));

        return "mdexmM/checkM";
    }

    @GetMapping("/chartM")
    public String chartM(){
        return "mdexmM/chartM";
    }

    @GetMapping("/dssM")
    public String dssM(Model model, CriteriaM cri){
        System.out.println(cri);
        model.addAttribute("list",mService.getdssList(cri));
        model.addAttribute("cri",cri);

        return "mdexmM/dssM";
    }

    //질병 삭제
    @GetMapping("/dssdel/{dss_no}")
    public String dssdel(@PathVariable("dss_no") String dss_no){
        mService.dssdel(dss_no);
        return "redirect:/mdexmM/dssM";
    }

    @GetMapping("/therapyM")
    public String therapyM(Model model, CriteriaM cri) {

        model.addAttribute("list",mService.getTherapyList(cri));
        model.addAttribute("cri",cri);
        return "mdexmM/therapyM";
    }

    @GetMapping("/wrhsM")
    public String wrhsM(Model model, CriteriaM cri){
        model.addAttribute("list", mService.getWrhsList(cri));
        model.addAttribute("cri",cri);
        model.addAttribute("flc", mService.getflctnList());

        return "mdexmM/wrhsM";
    }


    //의약품 업데이트 및 삭제
    @PostMapping("/delmdcn")
    public String delmdcn(FlctnVO vo){
        mService.delmdcn(vo);

        return "redirect:/mdexmM/therapyM";
    }
    @PostMapping("/updatemdcn")
    public String updatemdcn(FlctnVO vo){
        mService.updatemdcn(vo);

        return "redirect:/mdexmM/therapyM";
    }

    @PostMapping("/delmdcnt")
    public String delmdcnt(FlctnVO vo){
        mService.changeflctn(vo);
        mService.delmdcn(vo);

        return "redirect:/mdexmM/wrhsM";
    }
    @PostMapping("/updatemdcnt")
    public String updatemdcnt(FlctnVO vo){

        mService.changeflctn(vo);
        mService.updatemdcn(vo);

        return "redirect:/mdexmM/wrhsM";
    }

    @PostMapping("/regChart")
    public String regChart(MdexmMVO vo,
                           RedirectAttributes ra,
                           @RequestParam("mdcn_code")List<String> code,
                           @RequestParam("flctn_qty")List<Integer> qty){

        List<FlctnVO> list = new ArrayList<>();
        for (int i = 0;i < code.size();i++){
            list.add(FlctnVO.builder().flctn_qty(qty.get(i)).mdcn_code(code.get(i)).build());
        }
        if(mService.regChart(vo, list)==1) ra.addFlashAttribute("msg","정상적으로 처리되었습니다.");
        else ra.addFlashAttribute("msg", "등록에 실패했습니다. 관리자에게 문의하세요. 1566-6666");

        System.out.println(list);

        return "redirect:/mdexmM/chartM";
    }

}
