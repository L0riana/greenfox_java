package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoxDB {

  private static List<Fox> foxList = new ArrayList<>(Arrays.asList());

  public FoxDB() {
  }

  public FoxDB(List<Fox> foxList) {
    this.foxList = foxList;
  }

  public static List<Fox> getFoxList() {
    return foxList;
  }

  public void setFoxList(List<Fox> foxList) {
    this.foxList = foxList;
  }
}
