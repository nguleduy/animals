package com.example.animals.model;

import com.example.animals.service.CanWalk;

public class Animal implements CanWalk {

  @Override
  public void walk() {
    System.out.println("I am walking");
  }

}
