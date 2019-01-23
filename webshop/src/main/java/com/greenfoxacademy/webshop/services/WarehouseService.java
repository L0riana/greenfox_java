package com.greenfoxacademy.webshop.services;

import com.greenfoxacademy.webshop.models.NewOrder;
import com.greenfoxacademy.webshop.models.Summary;
import com.greenfoxacademy.webshop.models.Warehouse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WarehouseService {

  List<Warehouse> listAllItems();

  List<String> uniqueNames();

  List<String> uniqueSizes();

  List<Warehouse> findItemsByParam(String range, float price);

  Summary calculateSummary(NewOrder newOrder);
}
