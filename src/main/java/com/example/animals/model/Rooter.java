package com.example.animals.model;

import com.example.animals.service.CanSing;

public class Rooter implements CanSing {

  @Override
  public void sing() {
    System.out.println("Cock-a-doodle-doo");
  }

}
