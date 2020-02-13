package com.example.animals.model;

import com.example.animals.model.constant.Constant;
import com.example.animals.service.CanSwim;

public class Dolphin extends ConcreteAnimal implements CanSwim {

  @Override
  public void swim() {
    System.out.println(Constant.CAN_SWIM);
  }
}
