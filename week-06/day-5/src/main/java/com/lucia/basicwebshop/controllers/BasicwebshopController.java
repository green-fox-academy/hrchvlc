package com.lucia.basicwebshop.controllers;

import com.lucia.basicwebshop.models.ShopItem;
import com.lucia.basicwebshop.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class BasicwebshopController {
    private WebShop myWebShop = new WebShop(new ArrayList<>(Arrays.asList(
            new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5),
            new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2),
            new ShopItem("Coca-cola", "0.5 l standard coke", 25, 0),
            new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100),
            new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1))));

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("items", myWebShop.getShopItemList());
        return "index";
    }
    @GetMapping("/only-available")
    public String getOnlyAvailable(Model model) {
        model.addAttribute("items", myWebShop.getListOnlyAvailable());
        return "index";
    }
    @GetMapping("/cheapest-first")
    public String getCheapestFirst(Model model) {
        model.addAttribute("items", myWebShop.getListFromCheapest());
        return "index";
    }
    @GetMapping("/contains-nike")
    public String getOnlyWithWord(Model model) {
        model.addAttribute("items", myWebShop.getOnlyWithWord());
        return "index";
    }
    @GetMapping("/average-stock")
    public String getAverage(Model model) {
        model.addAttribute("average", myWebShop.getAverageOfStock());
        return "index";
    }
    @GetMapping("/most-expensive")
    public String getMostExpensive(Model model) {
        model.addAttribute("expensive", myWebShop.getMostExpensiveFromList());
        return "index";
    }
    @PostMapping("/search")
    public String getSearch(Model model, @RequestParam String wanted) {
        model.addAttribute("items", myWebShop.getListContainWord(wanted));
        return "index";
    }

}
