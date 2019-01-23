package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

  private List<BankAccount> bankAccounts = new ArrayList<>();

  @RequestMapping(value = "/show", method = RequestMethod.GET)
  public String showBalance(Model model) {
    model.addAttribute("bankaccount",
            new BankAccount("Simba", 2000, "lion", true, true));
    return "bankofsimba";
  }

  @RequestMapping(value = "/showaccounts", method = RequestMethod.GET)
  public String showAllAccount(Model model) {
    ArrayList<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(
            new BankAccount("Simba", 2000, "lion", true, true),
            new BankAccount("Pumbaa", 900, "warthog", false, true),
            new BankAccount("Banzai", 800, "hyena", false, false),
            new BankAccount("Pumbaa", 700, "horbill", false, true),
            new BankAccount("Rafiki", 600, "mandrill", false, true)
    ));
    model.addAttribute("accounts", bankAccounts);
    return "multipleaccounts";
  }

  @PostMapping("/showaccounts")
  public String raiseBalance(String name) {
    return "redirect:/multipleaccounts";
  }
}
