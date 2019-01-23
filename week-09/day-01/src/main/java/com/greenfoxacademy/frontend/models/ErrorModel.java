package com.greenfoxacademy.frontend.models;

public class ErrorModel extends GreeterModel {

  private String error;

  public ErrorModel() {
    error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
