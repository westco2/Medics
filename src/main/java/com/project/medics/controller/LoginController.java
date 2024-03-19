package com.project.medics.controller;

import com.project.medics.command.LoginZVO;
import com.project.medics.loginZ.service.LoginZMapper;
import com.project.medics.loginZ.service.LoginZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private LoginZMapper loginZMapper;
    @GetMapping("/mypage/mypageZ")
    public String mypageZ(){
        return "/mypage/mypageZ";
    }


    //암호화 위한 회원가입
    @GetMapping("/mypage/joinZ")
    public String joinZ(){
        return "/mypage/joinZ";
    }
    @PostMapping("/mypage/joinFormZ")
    public String joinFormZ(LoginZVO loginZVO){

        String pwZ = bCryptPasswordEncoder.encode(loginZVO.getPassword());
        loginZVO.setPassword(pwZ);
        System.out.println("pwZ = " + pwZ);
        System.out.println("loginZVO = " + loginZVO);
        loginZMapper.join(loginZVO);
        System.out.println(loginZVO);
        return "/mypage/loginM"; //가입후 로그인페이지로
    }

    @GetMapping("/mypage/loginM")
    public String loginM(){
        return "/mypage/loginM";
    }
}
