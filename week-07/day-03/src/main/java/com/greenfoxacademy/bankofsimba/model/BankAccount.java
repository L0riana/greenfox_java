package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private String currency;
  private boolean isKing;
  private boolean isGood;


  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
    currency = "Zebra";
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
