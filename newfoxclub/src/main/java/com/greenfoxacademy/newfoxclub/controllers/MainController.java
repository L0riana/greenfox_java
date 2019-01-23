package com.greenfoxacademy.newfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping(value = "/")
  public String indexPage() {
    return "index";
  }

  @GetMapping(value = "/login")
  public String loginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }
}