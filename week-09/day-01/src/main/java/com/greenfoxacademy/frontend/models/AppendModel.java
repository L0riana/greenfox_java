package com.greenfoxacademy.frontend.models;

public class AppendModel {

  private String appendable;
  private String appended;

  public AppendModel(String appendable) {
    appended = appendable + "a";
  }

  public String getAppendable() {
    return appendable;
  }

  public void setAppendable(String appendable) {
    this.appendable = appendable;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
