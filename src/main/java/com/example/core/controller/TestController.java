package com.example.core.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String secureMethod(OAuth2AuthenticationToken token) {
        System.out.println(token.getPrincipal());
        return "secure.html";
    }

}
