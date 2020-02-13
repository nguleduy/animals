package com.example.animals.model;

import com.example.animals.model.constant.Constant;
import com.example.animals.model.constant.ParrotType;
import com.example.animals.model.interfaces.CanFly;
import com.example.animals.model.interfaces.CanSing;
import com.example.animals.model.interfaces.CanWalk;

public class Parrot extends Bird implements CanWalk, CanSing, CanFly {

  private ParrotType liveWith;

  public Parrot(ParrotType liveWith) {
    this.setLiveWith(liveWith);
  }

  public ParrotType getLiveWith() {
    return this.liveWith;
  }

  public void setLiveWith(ParrotType liveWith) {
    this.liveWith = liveWith;
  }

  public void sing() {
    switch (this.getLiveWith()) {
      case DOG:
        System.out.println(Constant.DOG_SING);
      case CAT:
        System.out.println(Constant.CAT_SING);
      case ROOSTER:
        System.out.println(Constant.ROOSTER_SING);
      case DUCK:
        System.out.println(Constant.DUCK_SING);
      case PHONE:
        System.out.println(Constant.PHONE);
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
