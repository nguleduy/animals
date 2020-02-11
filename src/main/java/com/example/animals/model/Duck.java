package com.example.animals.model;

import com.example.animals.service.CanSwim;

public class Duck extends Bird implements CanSwim {

  public void sing() {
    System.out.println(Constant.DUCK_SING);
  }

  @Override
  public void swim() {
    System.out.println(Constant.CAN_SWIM);
  }
}
