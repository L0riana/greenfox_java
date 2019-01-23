package com.greenfoxacademy.foxclub.models;

import java.util.List;

public class Fox {

  private String name;
  private List<Trick> listOfTricks;
  private String food;
  private String drink;

  public Fox() {

  }

  public String getName() {
    return name;
  }

  public List<Trick> getListOfTricks() {
    return listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }
}
