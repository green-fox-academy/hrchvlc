package com.lucia.orientationexampleexam.controllers;

import com.lucia.orientationexampleexam.models.UrlAlias;
import com.lucia.orientationexampleexam.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    MainService service;

    @Autowired
    public MainController(MainService service) {
        this.service = service;
    }

    @GetMapping("/")
    private String renderRoot(Model model) {
        model.addAttribute("urlAlias", new UrlAlias());
        return "index";
    }
    @PostMapping("/save-link")
    private String saveLink(Model model, @ModelAttribute UrlAlias urlAlias) {
        model.addAttribute("urlAlias", urlAlias);
        boolean isStored = service.isAlreadyStored(urlAlias.getAlias());
        if (isStored) {
            // error scenario
            model.addAttribute("message", "Your alias is already in use");
            model.addAttribute("urlAlias", urlAlias);
        } else {
            service.save(urlAlias);
            String message = "Your URL is aliased to " + urlAlias.getAlias() + " and your secred code is " + urlAlias.getSecretCode();
            model.addAttribute("message", message);
            model.addAttribute("urlAlias", new UrlAlias());

        }
        model.addAttribute("urlAlias", urlAlias);
        return "index";
    }
}
