package com.greenfoxacademy.webapi.hellobeanworld;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Printer {

  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }
}
