package com.project.medics.loginZ.service;

import com.project.medics.command.LoginZVO;
import com.project.medics.command.MdexmMVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsServiceZ implements UserDetailsService {
    @Autowired
    private LoginZMapper loginZMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginZVO loginZVO = loginZMapper.loginZVO(username);
        ArrayList<MdexmMVO> mdexmMVOZ = loginZMapper.mdexmMVOZ(username);
        if(loginZVO != null){
            System.out.println("loginZVO111 = " + loginZVO);
            System.out.println("mdexmMVOZ111 = " + mdexmMVOZ);
            return new MyUserDetailsZ(loginZVO);
        }
        return null;
    }
}
