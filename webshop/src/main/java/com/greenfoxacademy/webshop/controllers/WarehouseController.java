package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.NewOrder;
import com.greenfoxacademy.webshop.models.Summary;
import com.greenfoxacademy.webshop.models.Warehouse;
import com.greenfoxacademy.webshop.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WarehouseController {

  private WarehouseService warehouseService;

  @Autowired
  public WarehouseController(WarehouseService warehouseService) {
    this.warehouseService = warehouseService;
  }

  @GetMapping({ "/", "/warehouse" })
  public String warehouse(Model model) {
    List<Warehouse> allItems = warehouseService.listAllItems();
    List<String> uniqueNames = warehouseService.uniqueNames();
    List<String> uniqueSizes = warehouseService.uniqueSizes();
    model.addAttribute("items", allItems);
    model.addAttribute("uniquenames", uniqueNames);
    model.addAttribute("uniquesizes", uniqueSizes);
    model.addAttribute("order", new NewOrder());
    return "index";
  }

  @PostMapping(value = "/warehouse/summary")
  public String getNewOrder(@ModelAttribute NewOrder order, Model model) {
    Summary summary = warehouseService.calculateSummary(order);
    model.addAttribute("summary", summary);
    return "summary";
  }
}
