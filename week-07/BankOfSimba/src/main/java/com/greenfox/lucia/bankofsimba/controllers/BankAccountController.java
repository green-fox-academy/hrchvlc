package com.greenfox.lucia.bankofsimba.controllers;

import com.greenfox.lucia.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    List<BankAccount> listOfAccounts = new ArrayList<>();

    BankAccount firstBankAccount = new BankAccount("Simba", 2000, "lion", true);
    BankAccount secondBankAccount = new BankAccount("Scar", 50000, "lion", false);
    BankAccount thirdBankAccount = new BankAccount("Mufasa", 90000, "lion", false);
    BankAccount fourthBankAccount = new BankAccount("Timon", 3000, "meerkat", false);
    BankAccount fifthBankAccount = new BankAccount("Pumbaa", 500, "warthog", false);

    @RequestMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute("name", firstBankAccount.getName());
        model.addAttribute("balance", firstBankAccount.getBalance());
        model.addAttribute("animalType", firstBankAccount.getAnimalType());
        model.addAttribute("isKing", firstBankAccount.isKing());
        return "show";
    }
    @RequestMapping("/end")
    public String showEnd(Model model) {
        String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", text);
        return "end";
    }
    @RequestMapping("/list")
    public String showList(Model model) {
        model.addAttribute("name", firstBankAccount.getName());
        model.addAttribute("balance", firstBankAccount.getBalance());
        model.addAttribute("animalType", firstBankAccount.getAnimalType());
        model.addAttribute("isKing", firstBankAccount.isKing());
        model.addAttribute("list", listOfAccounts);
        return "list";
    }

    public BankAccountController() {
        listOfAccounts.add(firstBankAccount);
        listOfAccounts.add(secondBankAccount);
        listOfAccounts.add(thirdBankAccount);
        listOfAccounts.add(fourthBankAccount);
        listOfAccounts.add(fifthBankAccount);
    }
}
