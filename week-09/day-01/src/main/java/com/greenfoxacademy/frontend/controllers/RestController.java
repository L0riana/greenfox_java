package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return new ErrorModel();
    } else {
      return new Doubling(input);
    }
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public GreeterModel greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (name == null) {
      return new GreeterModel();
    } else if (title == null) {
      return new GreeterModel(title);
    } else {
      return new GreeterModel(name, title);
    }
  }

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public AppendModel append(@PathVariable String appendable) {
    return new AppendModel(appendable);
  }

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public DoUntil doUntil(@RequestBody(required = false) DoUntil until, @PathVariable(required = false) String what) {
    if (until != null) {
      if (what.equals("sum")) {
        until.sum();
      } else if (what.equals("factor")) {
        until.factor();
      } else {
        until.setError("Please provide a number!");
      }
    } else {
      until = new DoUntil();
      until.setError("Please provide a number!");
    }
    return until;
  }
}
