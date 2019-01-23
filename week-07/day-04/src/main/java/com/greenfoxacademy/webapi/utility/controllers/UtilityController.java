package com.greenfoxacademy.webapi.utility.controllers;

import com.greenfoxacademy.webapi.utility.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping(value = "/useful")
  public String mainPage() {
    return "utilitylinks";
  }

  @RequestMapping(value = "/useful/colored")
  public String coloredPage(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "backgroundcolor";
  }

  @RequestMapping(value = "/useful/email")
  public String emailPage(Model model, @RequestParam("email") String email) {
    if (utilityService.validateEmail(email)) {
      model.addAttribute("email", email + " is a valid email address");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("email", email + " is not a valid email address");
      model.addAttribute("color", "red");
    }
    return "validateemail";
  }

  @RequestMapping("/useful/caesar")
  public String caesarCipher(Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
    model.addAttribute("text", utilityService.caesarCipher(text, number));
    return "caesarcipher";
  }
}
