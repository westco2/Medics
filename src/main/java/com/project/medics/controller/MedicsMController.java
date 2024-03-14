package com.project.medics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mdexmM")
public class MedicsMController {
    @GetMapping("/checkM")
    public String checkM(){
        return "mdexmM/checkM";
    }
}
