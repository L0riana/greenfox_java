package com.greenfoxacademy.youndusarrow.controller;

import com.greenfoxacademy.youndusarrow.model.YondusArrow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/yondu")
  public YondusArrow yondusArrow(@RequestParam(required = false) double distance, @RequestParam(required = false) double time) {
    return new YondusArrow(distance, time);
  }
}
