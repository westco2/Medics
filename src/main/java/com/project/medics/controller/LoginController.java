package com.project.medics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/mypage/UI-A-113")
    public String UI_A_113(){
        return "/mypage/UI-A-113";
    }

}
