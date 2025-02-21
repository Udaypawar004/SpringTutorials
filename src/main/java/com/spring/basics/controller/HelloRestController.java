package com.spring.basics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    // method to send rest api
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello from Bridgelabz";
    }
}