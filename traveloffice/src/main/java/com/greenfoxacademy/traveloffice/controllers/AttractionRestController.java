package com.greenfoxacademy.traveloffice.controllers;

import com.greenfoxacademy.traveloffice.models.Attraction;
import com.greenfoxacademy.traveloffice.services.AttractionService;
import com.greenfoxacademy.traveloffice.services.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class AttractionRestController {

  private AttractionService attractionService;

  @Autowired
  public AttractionRestController(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  //http://localhost:8080/attractions?category=restaurant&city=budapest
  @GetMapping("/attractions")
  public List<Attraction> attractions(@RequestParam(name = "city", required = false) String city,
                                      @RequestParam(name = "category", required = false) String category) {
    return attractionService.findAllByCityAndCategory(city, category);
  }
}
