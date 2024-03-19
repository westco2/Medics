package com.project.medics.controller;


import com.project.medics.command.*;
import com.project.medics.mdexmM.service.MdexmMService;
import com.project.medics.util.CriteriaM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestMController {

    @Autowired
    @Qualifier("MdexmMService")
    private MdexmMService mdexmMService;

    @PostMapping("/regdss")
    public String regdss(@RequestBody List<DssVO> list){
        System.out.println(list);
        mdexmMService.regdss(list);



        return "success";
    }

    @PostMapping("/regmdcn")
    public String regmdcn(@RequestBody MdcnVO list){
        System.out.println(list);
        if(list.getMdcn_tp().equals("약품")){
            mdexmMService.regflctn(list);
        }
        mdexmMService.regmdcn(list);




        return "success";
    }

    @PostMapping("/getstdInfo")
    public ResponseEntity<List<StudentVO>> getstdInfo(@RequestBody CriteriaM cri){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json"); //내가 보내는 컨텐츠 타입

        return new ResponseEntity<>(mdexmMService.getstdInfo(cri), headers, HttpStatus.OK);
    }



    @PostMapping("/getdss")
    public ResponseEntity<List<DssVO>> getdss(@RequestBody CriteriaM cri){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json"); //내가 보내는 컨텐츠 타입

        return new ResponseEntity<>(mdexmMService.getdssList(cri), headers, HttpStatus.OK);
    }

    @PostMapping("/getty")
    public ResponseEntity<List<MdcnVO>> getty(@RequestBody CriteriaM cri){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json"); //내가 보내는 컨텐츠 타입

        return new ResponseEntity<>(mdexmMService.getTherapyList(cri), headers, HttpStatus.OK);
    }
    @PostMapping("/getwr")
    public ResponseEntity<List<MdcnVO>> getwr(@RequestBody CriteriaM cri){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json"); //내가 보내는 컨텐츠 타입

        return new ResponseEntity<>(mdexmMService.getWrhsList(cri), headers, HttpStatus.OK);
    }

    @PostMapping("/getflu")
    public ResponseEntity<List<MdexmMVO>> getflu(@RequestBody StudentVO vo){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json"); //내가 보내는 컨텐츠 타입

        return new ResponseEntity<>(mdexmMService.getmdx(vo), headers, HttpStatus.OK);
    }

    @PostMapping("/getflt")
    public ResponseEntity<List<FlctnVO>> getflt(@RequestBody FlctnVO vo){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json"); //내가 보내는 컨텐츠 타입

        return new ResponseEntity<>(mdexmMService.getfll(vo), headers, HttpStatus.OK);
    }


}
