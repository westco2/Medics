package com.project.medics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rentalJY")
public class RentalController {
	@GetMapping("/rentalApp")
	public String rentalApp() {
		return "rentalJY/rentalApp";
	}
	
	@GetMapping("/rentalList")
	public String rentalList() {
		return "rentalJY/rentalList";
	}
	
	@GetMapping("/approval")
	public String approval() {
		return "rentalJY/approval";
	}
}
