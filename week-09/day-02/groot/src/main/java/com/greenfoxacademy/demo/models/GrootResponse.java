package com.greenfoxacademy.demo.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrootResponse {

  private String received;
  private String translated;
  private String error;

  public GrootResponse(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public GrootResponse() {
    error = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
