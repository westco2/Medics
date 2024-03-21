package com.project.medics.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
=======
import com.project.medics.clinicW.service.RentalItemService;
import com.project.medics.command.RentalVO;

>>>>>>> 3483abd (안되면 뒤졌다)
@Controller
@RequestMapping("/rentalJY")
public class RentalController  {
	
	private static final RentalVO RentalVO = null;
	@Autowired
	@Qualifier("rentalService")
	private RentalItemService rentalService;
	
	@GetMapping("/rentalApp")
	public String rentalApp(Model model) {
		model.addAttribute("list", rentalService.getItemById());
		return "rentalJY/rentalApp";
	}
	
	@GetMapping("/rentalList")
<<<<<<< HEAD
	public String rentalList() {
=======
	public String rentalLista(Model model) {
		model.addAttribute("list", rentalService.getAllItems());
>>>>>>> 3483abd (안되면 뒤졌다)
		return "rentalJY/rentalList";
	}
	
	@GetMapping("/approval")
	public String approval(Model model) {
		model.addAttribute("list", rentalService.updateItem());
		return "rentalJY/approval";
	}
<<<<<<< HEAD
}
=======
	
	
	
}
>>>>>>> 3483abd (안되면 뒤졌다)
