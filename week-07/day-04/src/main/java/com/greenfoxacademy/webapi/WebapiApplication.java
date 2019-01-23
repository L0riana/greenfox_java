package com.greenfoxacademy.webapi;

import com.greenfoxacademy.webapi.color.MyColor;
import com.greenfoxacademy.webapi.hellobeanworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebapiApplication implements CommandLineRunner {

  @Autowired
  Printer printer;

  @Autowired
  MyColor myColor;

  public static void main(String[] args) {
    SpringApplication.run(WebapiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }
}
