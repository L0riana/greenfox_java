package com.greenfoxacademy.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  private AtomicLong id = new AtomicLong();

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam("name") String content) {
    id.getAndIncrement();
    return new Greeting(id, content);
  }
}
