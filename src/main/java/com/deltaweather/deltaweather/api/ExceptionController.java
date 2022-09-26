package com.deltaweather.deltaweather.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {
    @GetMapping("/accessDenied")
    public void accessDeniedException(){
        throw new RuntimeException();
    }

    @GetMapping("/unauthorized")
    public void unauthorizedException(){
        throw new RuntimeException();
    }
}
