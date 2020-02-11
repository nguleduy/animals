package com.example.animals.model;

import com.example.animals.service.CanFly;
import com.example.animals.service.CanSing;
import com.example.animals.service.CanWalk;

public class Animal implements CanWalk, CanFly, CanSing {

  @Override
  public void walk() {
    System.out.println("I am walking");
  }

  @Override
  public void fly() {
    System.out.println("I am flying");
  }

  @Override
  public void sing() {
    System.out.println("I am singing");
  }
}
