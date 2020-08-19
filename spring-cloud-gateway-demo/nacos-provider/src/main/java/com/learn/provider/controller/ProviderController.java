package com.learn.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @GetMapping("/helloProvider")
    public String helloProvider() {
        return "Hello, I am the provider!";
    }
}
