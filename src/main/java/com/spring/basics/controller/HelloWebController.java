package com.spring.basics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    // method for hello message
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    // method for handling web messages.
    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        return "message";
    }
}