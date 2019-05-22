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

    BankAccount firstBankAccount = new BankAccount("Simba", 2000.00, "lion", true, false);
    BankAccount secondBankAccount = new BankAccount("Scar", 50000.00, "lion", false, true);
    BankAccount thirdBankAccount = new BankAccount("Mufasa", 90000.00, "lion", false, false);
    BankAccount fourthBankAccount = new BankAccount("Timon", 3000.00, "meerkat", false, false);
    BankAccount fifthBankAccount = new BankAccount("Pumbaa", 500.00, "warthog", false, false);

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
