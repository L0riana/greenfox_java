package com.greenfoxacademy.webshop.repositories;

import com.greenfoxacademy.webshop.models.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse, Integer> {

  @Query("select distinct w.itemName from Warehouse w")
  List<String> uniqueNames();

  @Query("select distinct w.size from Warehouse w")
  List<String> uniqueSizes();

  List<Warehouse> findAllByUnitPriceEquals(float price);

  List<Warehouse> findAllByUnitPriceIsLessThan(float price);

  List<Warehouse> findAllByUnitPriceGreaterThan(float price);
}
