package com.example.animals.model;

import com.example.animals.model.constant.Color;
import com.example.animals.model.constant.Constant;
import com.example.animals.model.constant.Size;
import com.example.animals.service.CanEatFish;

public class Shark extends Fish implements CanEatFish {

  public Shark() {
    this.setSize(Size.LARGE);
    this.setColor(Color.GREY);
  }

  @Override
  public void eatFish() {
    System.out.println(Constant.CAN_EAT_FISH);
  }
}
