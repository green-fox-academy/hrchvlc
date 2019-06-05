package com.greenfox.lucia.foxclub.controllers;

import com.greenfox.lucia.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String createFox(@RequestParam String name, Model model) {
        model.addAttribute("name");
        return "redirect:/{name}";
    }

}

