package com.project.medics.controller;


import com.project.medics.loginZ.service.MyUserDetailsZ;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String home(Model model, @AuthenticationPrincipal MyUserDetailsZ userDetails) {
        if(userDetails!=null) {
            model.addAttribute("username", userDetails.getUsername());
        }
        return "posts/index";
    }

}
