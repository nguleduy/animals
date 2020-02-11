package com.example.animals.model;

public class Chicken extends Bird {

  private Rooster rooster;

  private boolean male = false;

  public Chicken() {};

  public Chicken(boolean isMale) {
    this.male = true;
  }

  public void sing() {
    if (this.male) {
      System.out.println(Constant.ROOSTER_SING);
    } else {
      System.out.println(Constant.CHICKEN_SING);
    }
  }

  @Override
  public void fly() {
    System.out.println(Constant.CANNOT_FLY);
  }
}
