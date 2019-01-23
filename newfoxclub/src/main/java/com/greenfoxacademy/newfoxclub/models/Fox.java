package com.greenfoxacademy.newfoxclub.models;

import java.util.List;

public class Fox {

  String name;
  List<Trick> trickList;
  String food;
  String drink;

  public Fox() {
  }

  public Fox(String name, List<Trick> trickList, String food, String drink) {
    this.name = name;
    this.trickList = trickList;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Trick> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<Trick> trickList) {
    this.trickList = trickList;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
