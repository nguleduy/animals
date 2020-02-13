package com.example.animals.model;

import com.example.animals.model.constant.Constant;
import com.example.animals.service.CanWalk;

public class CaterpillarButterfly extends Butterfly implements CanWalk {

  @Override
  public void walk() {
    System.out.println(Constant.CAN_WALK);
  }
}
