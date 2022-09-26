package com.deltaweather.deltaweather.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class LoginDto {
    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @Builder
    public LoginDto(String email, String password){
        this.email = email;
        this.password = password;
    }
}
