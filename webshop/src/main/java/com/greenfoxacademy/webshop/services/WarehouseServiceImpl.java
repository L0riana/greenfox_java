package com.greenfoxacademy.webshop.services;

import com.greenfoxacademy.webshop.models.NewOrder;
import com.greenfoxacademy.webshop.models.Summary;
import com.greenfoxacademy.webshop.models.Warehouse;
import com.greenfoxacademy.webshop.repositories.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

  private WarehouseRepository warehouseRepository;

  @Autowired
  public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
    this.warehouseRepository = warehouseRepository;
  }


  @Override
  public List<Warehouse> listAllItems() {
    List<Warehouse> allItems = new ArrayList<>();
    warehouseRepository.findAll()
            .forEach(allItems::add);
    return allItems;
  }

  @Override
  public List<String> uniqueNames() {
    List<String> uniqueNames = new ArrayList<>();
    warehouseRepository.uniqueNames()
            .forEach(uniqueNames::add);
    return uniqueNames;
  }

  @Override
  public List<String> uniqueSizes() {
    List<String> uniqueSizes = new ArrayList<>();
    warehouseRepository.uniqueSizes()
            .forEach(uniqueSizes::add);
    return uniqueSizes;
  }

  @Override
  public List<Warehouse> findItemsByParam(String range, float price) {
    if (range.equals("lower"))
      return warehouseRepository.findAllByUnitPriceIsLessThan(price);
    else if (range.equals("equals"))
      return warehouseRepository.findAllByUnitPriceEquals(price);
    else if (range.equals("higher"))
      return warehouseRepository.findAllByUnitPriceGreaterThan(price);
    return warehouseRepository.findAllByUnitPriceEquals(price);
  }

  public Summary calculateSummary(NewOrder newOrder) {
    Summary summary = new Summary();
    List<Warehouse> allItems = listAllItems();
    for (Warehouse oneItem : allItems) {
      if (oneItem.getItemName().equals(newOrder.getName())) {
        summary.setName(oneItem.getItemName());
        summary.setCategory(oneItem.getCategory());
        summary.setManufacturer(oneItem.getManufacturer());
        summary.setQuantity(newOrder.getQuantity());
        summary.setTotal(oneItem.getUnitPrice() * newOrder.getQuantity());
        break;
      }
    }
    return summary;
  }
}
