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

    @GetMapping("/chartM")
    public String chartM(){
        return "mdexmM/chartM";
    }

    @GetMapping("/dssM")
    public String dssM(){
        return "mdexmM/dssM";
    }

    @GetMapping("/therapyM")
    public String therapyM(){
        return "mdexmM/therapyM";
    }

    @GetMapping("wrhsM")
    public String wrhsM(){
        return "mdexmM/wrhsM";
    }
}
