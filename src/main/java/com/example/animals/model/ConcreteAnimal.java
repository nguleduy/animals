package com.example.animals.model;

import com.example.animals.service.Animal;

public class ConcreteAnimal implements Animal {

  private boolean male;

  public boolean isMale() {
    return male;
  }

  public void setMale(boolean male) {
    this.male = male;
  }

}
