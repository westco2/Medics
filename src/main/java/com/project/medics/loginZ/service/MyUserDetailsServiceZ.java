package com.project.medics.loginZ.service;

import com.project.medics.command.LoginZVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServiceZ implements UserDetailsService {
    @Autowired
    private LoginZMapper loginZMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginZVO loginZVO = loginZMapper.loginZVO(username);
        if(loginZVO != null){
            return new MyUserDetailsZ(loginZVO);
        }
        return null;
    }
}
