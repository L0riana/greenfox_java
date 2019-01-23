package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.QueryResult;
import com.greenfoxacademy.webshop.models.Warehouse;
import com.greenfoxacademy.webshop.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WarehouseRestController {

  private WarehouseService warehouseService;

  @Autowired
  public WarehouseRestController(WarehouseService warehouseService) {
    this.warehouseService = warehouseService;
  }

  @GetMapping(value = "/warehouse/query")
  public ResponseEntity<QueryResult> queryTheItems(@RequestParam("price") int price, @RequestParam("type") String type) {
    List<Warehouse> result = warehouseService.findItemsByParam(type, price);
    QueryResult qResult = new QueryResult("ok", result);
    return ResponseEntity.status(HttpStatus.OK).body(qResult);
  }
}
