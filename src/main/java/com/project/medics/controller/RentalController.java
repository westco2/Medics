package com.project.medics.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/Rental")
public class RentalController {
	@GetMapping("/rentalApp")
	public String rentalApp() {
		return "Rental/rentalApp";
	}
	
	@GetMapping("/mana")
	public String mana() {
		return "Rental/mana";
	}
	
	@GetMapping("/Approval")
}
