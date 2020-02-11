package com.example.animals.model;

import com.example.animals.service.CanFly;
import com.example.animals.service.CanSing;
import com.example.animals.service.CanWalk;

public class Animal implements CanWalk, CanFly, CanSing {

  @Override
  public void walk() {
    System.out.println(Constant.CAN_WALK);
  }

  @Override
  public void fly() {
    System.out.println(Constant.CAN_FLY);
  }

  @Override
  public void sing() {
    System.out.println(Constant.CAN_SING);
  }
}
