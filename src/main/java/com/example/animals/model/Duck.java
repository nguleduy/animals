package com.example.animals.model;

import com.example.animals.service.CanSwim;

public class Duck extends Bird implements CanSwim {

  public void sing() {
    System.out.println("Quack, quack");
  }

  @Override
  public void swim() {
    System.out.println("I am swimming");
  }
}
