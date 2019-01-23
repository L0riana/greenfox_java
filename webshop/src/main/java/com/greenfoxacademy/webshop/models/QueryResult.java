package com.greenfoxacademy.webshop.models;

import java.util.List;

public class QueryResult {

  private String result;
  private List<Warehouse> clothes;

  public QueryResult(String result, List<Warehouse> myList) {
    this.result = result;
    this.clothes = myList;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Warehouse> getClothes() {
    return clothes;
  }

  public void setClothes(List<Warehouse> clothes) {
    this.clothes = clothes;
  }
}
