package com.deltaweather.deltaweather.api.auth;

import com.deltaweather.deltaweather.domain.dto.LoginDto;
import com.deltaweather.deltaweather.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Validated LoginDto loginDto){
        String message = authService.login(loginDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody @Validated LoginDto loginDto){
        String message = authService.logout();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
