package com.project.medics.controller;

import com.project.medics.command.LoginZVO;
import com.project.medics.command.MdexmMVO;
import com.project.medics.loginZ.service.LoginZMapper;
import com.project.medics.loginZ.service.LoginZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class LoginController {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private LoginZMapper loginZMapper;
//    @GetMapping("/mypage/mypageZ")
//    public String mypageZ(){
//        return "/mypage/mypageZ";
//    }


    //암호화 위한 회원가입
    @GetMapping("/mypage/joinZ")
    public String joinZ(){
        return "/mypage/joinZ";
    }
    @PostMapping("/mypage/joinFormZ")
    public String joinFormZ(LoginZVO loginZVO, Model model){
        System.out.println("===============" + loginZVO.getUsername());
        System.out.println(loginZMapper.checkIDZ(loginZVO.getUsername()));
        model.addAttribute("checkIDZ",loginZMapper.checkIDZ(loginZVO.getUsername()) ) ;
        if(loginZMapper.checkIDZ(loginZVO.getUsername()) == 1) { //studentid 가 존재한다
            String pwZ = bCryptPasswordEncoder.encode(loginZVO.getPassword());
            loginZVO.setPassword(pwZ);
            System.out.println("pwZ = " + pwZ);
            System.out.println("loginZVO = " + loginZVO);
            loginZMapper.join(loginZVO);
            System.out.println(loginZVO);
            return "/mypage/loginM"; //가입후 로그인페이지로
        }
        else return "/mypage/joinZ"; //가입 실패시 돌아가는 페이지
    }

    @GetMapping("/mypage/loginM")
    public String loginM(){
        return "/mypage/loginM";
    }

    @GetMapping("/mypage/mypageZ")
    public String mypageZZ(Model model) {
        // Spring Security를 통해 현재 인증된 사용자의 정보 가져오기
        System.out.println("이거왜 안돼");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        System.out.println("username = " + username);
        // 가져온 아이디를 이용하여 MdexmMVO 객체 조회
        ArrayList<MdexmMVO> mdexmMVOZ = loginZMapper.mdexmMVOZ(username);
        if( mdexmMVOZ != null){
            model.addAttribute("mdexmMVOZ", mdexmMVOZ);
        }
        System.out.println("mdexmMVOZ = " + mdexmMVOZ);
        System.out.println("model = " + model);
        return "/mypage/mypageZ";
    }


}
