package com.greenfoxacademy.licenceplate.controllers;

import com.greenfoxacademy.licenceplate.services.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainLicencePlateController {

  private LicencePlateService licencePlateService;

  @Autowired
  public MainLicencePlateController(LicencePlateService licencePlateService) {
    this.licencePlateService = licencePlateService;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    model.addAttribute("allPlates", licencePlateService.getAll());
    return "index";
  }

  @GetMapping("/search")
  public String searchLicencePlate(@RequestParam(name = "plate", required = false) String plate, Model model) {
    if (!licencePlateService.validateSearch(plate)) {
      model.addAttribute("error", "Sorry, the submitted licence plate is not valid.");
      return "index";
    } else {
      model.addAttribute("allPlates", licencePlateService.searchedPlate(plate));
      return "index";
    }
  }

  @GetMapping("/search/{brand}")
  public String searchByBrand(@PathVariable(name = "brand", required = false) String carBrand, Model model) {
    model.addAttribute("allPlates", licencePlateService.getByBrand(carBrand));
    return "index";
  }
}
