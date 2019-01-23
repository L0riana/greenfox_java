package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.FoxDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  private FoxDB foxDB;

  @Autowired
  public FoxService(FoxDB foxDB) {
    this.foxDB = foxDB;
  }

  public Fox findOne(String name) {
    for (Fox fox : FoxDB.getFoxList()) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }
    return new Fox();
  }
}
