package com.example.animals.model;

public class Chicken extends Bird {

  private Rooter rooter;

  private boolean male = false;

  public Chicken() {};

  public Chicken(boolean isMale) {
    this.male = true;
  }

  public void sing() {
    if (this.male) {
      System.out.println("Cock-a-doodle-doo");
    } else {
      System.out.println("Cluck, cluck");
    }
  }

  @Override
  public void fly() {
    System.out.println("I am cannot fly");
  }
}
