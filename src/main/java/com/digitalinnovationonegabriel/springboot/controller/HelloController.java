package com.digitalinnovationonegabriel.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloMessange(){
        return "Hello World of Digital Innovation One";
    }
}
