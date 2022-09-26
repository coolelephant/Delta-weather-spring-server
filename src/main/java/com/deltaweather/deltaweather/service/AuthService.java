package com.deltaweather.deltaweather.service;


import com.deltaweather.deltaweather.api.auth.SessionUtils;
import com.deltaweather.deltaweather.domain.dto.LoginDto;
import com.deltaweather.deltaweather.exception.LoginFailException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    public String login(LoginDto loginDto){
        try{
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginDto.getEmail(),loginDto.getPassword());
            Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);

            return "login success";
        }catch (Exception e){
            log.error("login error={}",e.toString());
            throw new LoginFailException();
        }
    }

    public String logout(){
        HttpSession session = SessionUtils.getSession();
        if(session!=null){
            session.invalidate();
        }
        return "logout success";
    }
}
