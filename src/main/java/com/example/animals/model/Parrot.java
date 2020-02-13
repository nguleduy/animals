package com.example.animals.model;

import com.example.animals.service.CanFly;
import com.example.animals.service.CanSing;
import com.example.animals.service.CanWalk;

public class Parrot extends Bird implements CanWalk, CanSing, CanFly {

  private String liveWith;

  public Parrot() {
  }

  public Parrot(String liveWith) {
    this.setLiveWith(liveWith);
  }

  public String getLiveWith() {
    return liveWith;
  }

  public void setLiveWith(String liveWith) {
    this.liveWith = liveWith;
  }

  public void sing() {
    switch (this.getLiveWith()) {
      case "dog":
        System.out.println(Constant.DOG_SING);
      case "cat":
        System.out.println(Constant.CAT_SING);
      case "rooster":
        System.out.println(Constant.ROOSTER_SING);
    }
  }

  @Override
  public void walk() {
    System.out.println(Constant.CAN_WALK);
  }

  @Override
  public void fly() {
    System.out.println(Constant.CAN_FLY);
  }
}
