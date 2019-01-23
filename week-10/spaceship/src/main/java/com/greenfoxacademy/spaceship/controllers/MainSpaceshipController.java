package com.greenfoxacademy.spaceship.controllers;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import com.greenfoxacademy.spaceship.services.SpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainSpaceshipController {

  private SpaceshipService spaceshipService;

  @Autowired
  public MainSpaceshipController(SpaceshipService spaceshipService) {
    this.spaceshipService = spaceshipService;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    List<Planet> planets = spaceshipService.getAllPlanet();
    Spaceship spaceship = spaceshipService.getSpaceship();
    model.addAttribute("planets", planets);
    model.addAttribute("spaceship", spaceship);
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveShipToPlanet(@PathVariable Long id){
    spaceshipService.moveShipToPlanet(id);
    return "redirect:/";
  }

  @GetMapping("/toship/{id}")
  public String movePeopleToShip(@PathVariable(value = "id") Long id) {
    spaceshipService.movePeopleToShip(id);
    return "redirect:/";
  }

  @GetMapping("/toplanet/{id}")
  public String movePeopleToPlanet(@PathVariable(value = "id") Long id) {
    spaceshipService.movePeopleToPlanet(id);
    return "redirect:/";
  }
}
