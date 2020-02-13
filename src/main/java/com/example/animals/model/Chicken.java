package com.example.animals.model;

import com.example.animals.model.constant.Constant;
import com.example.animals.service.CanSing;
import com.example.animals.service.CanWalk;

public class Chicken extends Bird implements CanWalk, CanSing {

  public Chicken(boolean isMale) {
    this.setMale(isMale);
  }

  public void sing() {
    if (this.isMale()) {
      System.out.println(Constant.ROOSTER_SING);
    } else {
      System.out.println(Constant.CHICKEN_SING);
    }
  }

  @Override
  public void walk() {
    System.out.println(Constant.CAN_WALK);
  }

}
