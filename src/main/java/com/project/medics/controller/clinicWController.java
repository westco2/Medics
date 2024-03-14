package com.project.medics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class clinicWController {

	@GetMapping("/clinicWPage")
	public String clinicWPatge() {
		
		return "clinicW/clinicWPage";
	}
	
	@GetMapping("/clinicWDetailPage")
	public String clinicWDetailPage() {
		
		return "clinicW/clinicWDetailPage";
	}
	
	@GetMapping("/clinicWReview")
	public String clinicWReview() {
		
		return "clinicW/clinicWReview";
	}
	
	@GetMapping("/clinicWStatus")
	public String clinicWStatus() {
		
		return "clinicW/clinicWStatus";
	}
	
}
