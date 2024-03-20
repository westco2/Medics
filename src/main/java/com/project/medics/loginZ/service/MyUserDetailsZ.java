package com.project.medics.loginZ.service;

import com.project.medics.command.LoginZVO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUserDetailsZ implements UserDetails {
    private LoginZVO loginZVO;
    public MyUserDetailsZ(LoginZVO loginZVO){
        this.loginZVO = loginZVO;
    }
    public String getRoleZ(){
        return loginZVO.getRole();
    }
    public String getKORN_FLNM(){
        return loginZVO.getKORN_FLNM();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<GrantedAuthority> list = new ArrayList<>();
        list.add(new GrantedAuthority() {

            @Override
            public String getAuthority() {
                return loginZVO.getRole(); //유저의 권한을 넣습니다.
            }
        });
        return list;
    }

    @Override
    public String getPassword() {
        return loginZVO.getPassword();
    }

    @Override
    public String getUsername() {
        return loginZVO.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
