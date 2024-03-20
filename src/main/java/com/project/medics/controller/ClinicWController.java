package com.project.medics.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.medics.clinicW.service.ClinicWService;
import com.project.medics.command.ClinicWVO;

@Controller
public class ClinicWController {

	@Autowired
	@Qualifier("clinicWService")
	private ClinicWService clinicWService;
	
	//클리닉게시판 메인페이지
	//관리자 권한, 학생 권한 둘 다 입장 가능. 단, 보여지는 화면은 다름
	//권한설정자께서는 둘 다 입장가능하게 구현해주시면 됨
	@GetMapping("/ClinicWPage")
	public String clinicWPage(Model model) {
		ArrayList<ClinicWVO> page = clinicWService.getPage();
		model.addAttribute("Page", page);
		return "clinicW/ClinicWPage";
	}
	
	//관리자 권한 : 클리닉 등록 or 수정페이지(클리닉등록 버튼클릭 or 수정 버튼클릭시 해당페이지로 이동됨)
	//관리자 권한, 학생 권한 둘 다 입장 가능. 단, 보여지는 화면은 다름
	//권한설정자께서는 둘 다 입장가능하게 구현해주시면 됨

//	@GetMapping("/ClinicWDetailPage")
//	public String clinicWDetailPage(@RequestParam("cli_ntc_sn") int cli_nte_sn,
//									Model model) {
//		ClinicWVO vo = clinicWService.getDetail(cli_nte_sn);
//		return "clinicW/ClinicWDetailPage";
//	}
	@GetMapping("/ClinicWDetailPage")
	public String clinicWDetailPage() {
		return "clinicW/ClinicWDetailPage";
	}
	
	// 클리닉 등록 처리
    @PostMapping("clinicW/ClinicWDetailPageInsertForm")
    public String clinicWInsert(@ModelAttribute("clinic") ClinicWVO vo) {
        // 클리닉을 저장하는 로직
        return "redirect:/clinicW/ClinicWPage"; // 등록 후 목록 페이지로 리다이렉트
    	}
    
    // 클리닉 수정 처리
    @PostMapping("clinicW/ClinicWDetailPageUpdateForm")
    public String clinicWUpdate(@RequestParam("cli_ntc_sn") int cli_ntc_sn,
    										  Model model) {
    	ClinicWVO vo = clinicWService.getClinicWUpdate(cli_ntc_sn);
    	model.addAttribute("vo", vo);
        return "redirect:/clinicW/ClinicWPage"; // 수정 후 목록 페이지로 리다이렉트
    	}
	
	//DB구문 확인 필수!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@GetMapping("/ClinicWStatus")
	public String clinicWStatus(Model model) {
		ArrayList<ClinicWVO> status = clinicWService.getStatus();
		model.addAttribute("Status", status);
		return "clinicW/ClinicWStatus";
	}

	//DB구문 확인 필수!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@GetMapping("/ClinicWReview")
	public String clinicWReview(Model model) {
		ArrayList<ClinicWVO> review = clinicWService.getReview();
		model.addAttribute("Status", review);
		return "clinicW/ClinicWReview";
	}
	
	//삭제요청
	@PostMapping("/deleteForm")
	public String deleteForm(@RequestParam("cli_ntc_sn") int cli_ntc_sn) {
		return "redirect:/clinicW/ClinicWPage";
	}
	
	
}
