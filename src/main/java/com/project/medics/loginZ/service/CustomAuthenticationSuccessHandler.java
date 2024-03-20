package com.project.medics.loginZ.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        // 인증 객체에서 ROLE_ADMIN 여부를 확인합니다.
        boolean isAdmin = authentication.getAuthorities().stream()
                .anyMatch(auth -> auth.getAuthority().equals("ROLE_ADMIN"));

        // isAdmin 값에 따라 리디렉션할 URL을 결정합니다.
        String redirectUrl = isAdmin ? "/mdexmM/checkM" : "/mypage/mypageZ";

        // 결정된 URL로 리디렉션합니다.
        response.sendRedirect(request.getContextPath() + redirectUrl);
    }
}
