package com.greenfoxacademy.frontend.models;

public class GreeterModel {

  private String welcome_message;
  private String error;
  private String name;
  private String title;

  public GreeterModel(String name, String title) {
    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public GreeterModel(String title) {
    this.error = "Please provide a title!";
  }

  public GreeterModel() {
    this.error = "Please provide a name!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
