package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.FoxFactory;
import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  private FoxFactory foxFactory;

  @Autowired
  private FoxService foxService;

  @GetMapping(value = "/")
  public String mainPage(@RequestParam String name, Model model) {
    if (name != null) {
      model.addAttribute("fox", foxService.findOne(name));
      return "index";
    } else return "redirect:/login";
  }

  @GetMapping(value = "/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String login(@RequestParam(required = false) String name, Model model) {
    if(foxService.findOne(name).equals(null)) {
      foxFactory.addNewFox(name, "fries", "Coca Cola");
    }
    return "redirect:/?name=" + name;
  }
}
