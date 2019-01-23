package com.greenfoxacademy.licenceplate.models;

import java.util.List;

public class LicencePlateResponse {

  private String result;
  private List<LicencePlate> search;

  public LicencePlateResponse(List<LicencePlate> search) {
    this.result = "ok";
    this.search = search;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<LicencePlate> getSearch() {
    return search;
  }

  public void setSearch(List<LicencePlate> search) {
    this.search = search;
  }
}
