package com.greenfoxacademy.traveloffice.controllers;

import com.greenfoxacademy.traveloffice.models.Attraction;
import com.greenfoxacademy.traveloffice.services.AttractionService;
import com.greenfoxacademy.traveloffice.services.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AttractionController {

  private AttractionService attractionService;

  @Autowired
  public AttractionController(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("attractions", attractionService.findAll());
    model.addAttribute("attrToEdit", new Attraction());
    return "index";
  }

  @PostMapping("/add")
  public String addAttraction(@ModelAttribute Attraction attraction) {
    attractionService.save(attraction);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String edit(Model model, @PathVariable int id) {
    model.addAttribute("attractions", attractionService.findAll());
    model.addAttribute("attrToEdit", attractionService.findById(id));
    return "index";
  }
}
