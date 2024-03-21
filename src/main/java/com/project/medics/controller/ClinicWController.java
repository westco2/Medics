package com.project.medics.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.medics.clinicW.service.ClinicWService;
import com.project.medics.command.ClinicWVO;

@Controller
public class ClinicWController {

	@Autowired
	@Qualifier("clinicWService")
	private ClinicWService clinicWService;
	
	@GetMapping("/clinicWPage")
	public String clinicWPage(Model model) {
		ArrayList<ClinicWVO> list = clinicWService.getList();
		model.addAttribute("list", list);
		return "/clinicW/clinicWPage";
	}
	
	@GetMapping("/clinicWApply")
	public String clinicWApply(@RequestParam("cli_ntc_sn") int cli_ntc_sn,
								Model model) {
		ClinicWVO vo = clinicWService.getDetail(cli_ntc_sn);
		model.addAttribute("vo", vo);
		return "clinicW/clinicWApply";
	}
	
	//클리닉 신청Form
	@PostMapping("/ApplyWForm")
	public String ApplyWForm(ClinicWVO vo, RedirectAttributes re) {
		int result = clinicWService.apply(vo);
		if(result == 1) {
			re.addFlashAttribute("msg", "신청완료");
		} else {
			re.addFlashAttribute("msg", "신청실패");
		}
		return "redirect:/clinicW/clinicWPage";
	}
	
	@GetMapping("/clinicWDetailPage")
	public String clinicWDetailPage() {
		return "clinicW/clinicWDetailPage";
	}
	
	//클리닉 등록Form
	@PostMapping("/InsertWForm")
	public String InsertWForm(ClinicWVO vo, RedirectAttributes re) {
		int result = clinicWService.regist(vo);
		if(result == 1) {
			re.addFlashAttribute("msg", "등록완료");
		} else {
			re.addFlashAttribute("msg", "등록실패");
		}
		return "redirect:/clinicW/clinicWPage";
	}
	
	@GetMapping("/clinicWUpdate")
	public String clinicWUpdate(@RequestParam("cli_ntc_sn") int cli_ntc_sn,
								Model model) {
		ClinicWVO vo = clinicWService.getDetail(cli_ntc_sn);
		model.addAttribute("vo", vo);
		return "clinicW/clinicWUpdate";
	}
	
	//클리닉 수정Form
	@PostMapping("/updateWForm")
	public String updateWForm(ClinicWVO vo, RedirectAttributes re) {
		int result = clinicWService.update(vo);
		if(result == 1) {
			re.addFlashAttribute("msg", "수정완료");
		} else {
			re.addFlashAttribute("msg", "수정실패");
		}
		return "redirect:/clinicW/clinicWPage";
	}
	
	//클리닉 삭제Form
	@PostMapping("/deleteForm")
	public String deleteForm(@RequestParam("cli_ntc_sn") int cli_ntc_sn) {
		clinicWService.delete(cli_ntc_sn);
		return "redirect:/clinicW/clinicWPage";
	}
	
	@GetMapping("/clinicWStatus")
	public String clinicWStatus(Model model) {
		ArrayList<ClinicWVO> status = clinicWService.getStatus();
		model.addAttribute("status", status);
		return "clinicW/clinicWStatus";
	}

	@GetMapping("/clinicWReview")
	public String clinicWReview(Model model) {
		ArrayList<ClinicWVO> review = clinicWService.getReview();
		model.addAttribute("review", review);
		return "clinicW/clinicWReview";
	}
}
