package com.example.animals.model;

import com.example.animals.model.constant.Constant;
import com.example.animals.service.CanFly;

public class ConcreteButterfly extends Butterfly implements CanFly {

  @Override
  public void fly() {
    System.out.println(Constant.CAN_FLY);
  }
}
