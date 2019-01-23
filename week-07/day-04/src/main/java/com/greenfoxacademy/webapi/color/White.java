package com.greenfoxacademy.webapi.color;

import com.greenfoxacademy.webapi.hellobeanworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class White implements MyColor{

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is white in color...");
  }
}
