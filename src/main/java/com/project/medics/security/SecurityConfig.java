package com.project.medics.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //config 파일임을 뜻함
@EnableWebSecurity //이 설정파일을 시큐리티 필터에 등록을 시킨다
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.csrf().disable();  //csrf 토큰을 사용 안함
        http.formLogin();  //시큐리티 기반의 폼로그인을 사용한다.

        //(모든요청에대해 인증(로그인)이 필요함) -> anyRequest
        http.authorizeRequests( (authorize) -> authorize.anyRequest().authenticated());
//        //특정페이지 인증이 필요함 -> antMatchers
//        http.authorizeRequests( (authorize) -> authorize.antMatchers("/hello").authenticated());
//        // /user/** 로 시작하는 모든 페이지는 인증(로그인)이 필요하다
//        http.authorizeRequests( (authorize)->authorize.antMatchers("/user/**").authenticated());
//        // hasRole 을 이용해 "USER"라는 권한이 있는 사람만 접근 가능하게한다
//        // .으로 연결해서 "ADMIN" 권한이 필요하도록 만든다
//        http.authorizeRequests( (authorize) -> authorize.antMatchers("/user/**").hasRole("USER")
//                                                        .antMatchers("/admin/**").hasRole("ADMIN"));
        return http.build();
    }
}
