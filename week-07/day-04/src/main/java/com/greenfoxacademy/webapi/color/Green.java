package com.greenfoxacademy.webapi.color;

import com.greenfoxacademy.webapi.hellobeanworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Green implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is green in color...");
  }
}
