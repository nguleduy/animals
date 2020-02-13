package com.example.animals.model;

import com.example.animals.model.constant.Constant;
import com.example.animals.service.CanSing;

public class Rooster implements CanSing {

  @Override
  public void sing() {
    System.out.println(Constant.ROOSTER_SING);
  }

}
