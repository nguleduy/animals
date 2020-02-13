package com.example.animals.model;

import com.example.animals.model.constant.Color;
import com.example.animals.model.constant.Constant;
import com.example.animals.model.constant.Size;
import com.example.animals.model.interfaces.CanMakeJoke;

public class Clownfish extends Fish implements CanMakeJoke {

  public Clownfish() {
    this.setSize(Size.SMALL);
    this.setColor(Color.ORANGE);
  }

  @Override
  public void makeJoke() {
    System.out.println(Constant.CAN_MAKE_JOKE);
  }
}
