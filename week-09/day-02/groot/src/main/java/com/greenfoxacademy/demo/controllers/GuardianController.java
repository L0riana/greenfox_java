package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.GrootResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public Object groot(@RequestParam(value = "message", required = false) String message) {
    if (message == null) {
      return new GrootResponse();
    } else {
      return new GrootResponse(message);
    }
  }
}
