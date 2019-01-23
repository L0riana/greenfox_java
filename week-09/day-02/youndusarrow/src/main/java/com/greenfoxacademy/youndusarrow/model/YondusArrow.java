package com.greenfoxacademy.youndusarrow.model;

public class YondusArrow {

  double distance;
  double time;
  double speed;
  String error;

  public YondusArrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance / time;
  }

  public YondusArrow() {
    this.error = "Please provide a distance";
  }

  public YondusArrow(double time) {
    this.error = "Please provide a time";
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }
}
