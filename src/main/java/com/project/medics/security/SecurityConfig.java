package com.project.medics.security;

import com.project.medics.loginZ.service.CustomAuthenticationSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration //config 파일임을 뜻함
@EnableWebSecurity //이 설정파일을 시큐리티 필터에 등록을 시킨다
public class SecurityConfig {

    //비밀번호 암호화 객체
    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();  //csrf 토큰을 사용 안함
        http
                .authorizeRequests()
                    .antMatchers("/css/**", "/js/**", "/img/**").permitAll()
                    .antMatchers("/homeH").permitAll()
                    .antMatchers("/mypage/**").permitAll()
                    .antMatchers("/mypage/joinFormZ").permitAll()
                    .antMatchers("/mypage/loginM").permitAll() // 로그인 페이지 접근 허용
                    .antMatchers("/login").permitAll()
                    .anyRequest().authenticated() // 나머지 요청은 인증 필요
                    .and()
                .formLogin()
                    .loginPage("/mypage/loginM") // 로그인 페이지 설정
                    .loginProcessingUrl("/login") // 로그인 페이지 접근 허용
                    .successHandler(successHandler()) // 로그인 성공 후 핸들러 설정

                    .and()
                .logout()
                    .permitAll(); // 로그아웃 접근 허용


        return http.build();
    }
    @Bean
    public AuthenticationSuccessHandler successHandler() {
        return new CustomAuthenticationSuccessHandler();
    }
}




