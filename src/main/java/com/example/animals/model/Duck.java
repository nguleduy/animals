package com.example.animals.model;

import com.example.animals.model.constant.Constant;
import com.example.animals.model.interfaces.CanSing;
import com.example.animals.model.interfaces.CanSwim;
import com.example.animals.model.interfaces.CanWalk;

public class Duck extends Bird implements CanSing, CanWalk, CanSwim {

  public void sing() {
    System.out.println(Constant.DUCK_SING);
  }

  @Override
  public void swim() {
    System.out.println(Constant.CAN_SWIM);
  }

  @Override
  public void walk() {
    System.out.println(Constant.CAN_WALK);
  }
}
