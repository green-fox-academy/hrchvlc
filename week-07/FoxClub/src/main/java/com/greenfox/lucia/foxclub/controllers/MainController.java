package com.greenfox.lucia.foxclub.controllers;

import com.greenfox.lucia.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }

}

