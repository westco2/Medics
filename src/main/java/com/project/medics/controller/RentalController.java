package com.project.medics.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.medics.clinicW.service.RentalItemService;
import com.project.medics.command.RentalVO;

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
	
	@PostMapping("/rentalAppt")
    public String rentalAppt(RentalVO rental) {
		rentalService.saveRentalApp(rental);
        return "redirect:/rentalJY/rentalApp";
    }
	
	@GetMapping("/rentalList")
	public String rentalLista(Model model) {
		model.addAttribute("list", rentalService.getAllItems());
		return "rentalJY/rentalList";
	}
	
	@PostMapping("/rentalList")
    public String apprabs (RentalVO rental) {
		rentalService.listplusapp(rental);
        return "redirect:/rentalJY/rentalList";
    }
	
	@GetMapping("/approval")
	public String approval(Model model) {
		model.addAttribute("list", rentalService.updateItem());
		return "rentalJY/approval";
	}	
	
	@PostMapping("/approval")
    public String sarental(RentalVO rental) {
		rentalService.appolist(rental);
        return "redirect:/rentalJY/approval";
    }
	
}

