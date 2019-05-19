package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model,@RequestParam String name) {
        model.addAttribute("name", "world");
        return "greeting";
    }
}
