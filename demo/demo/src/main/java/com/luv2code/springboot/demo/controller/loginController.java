package com.luv2code.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "fancy-login";
    }
    //add request mapping for access denied
    @GetMapping("/access-denied")
    public String accessDenied(){
        return "access-denied";
    }
}
