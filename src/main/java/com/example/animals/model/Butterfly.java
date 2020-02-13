package com.example.animals.model;

import com.example.animals.model.constant.ButterflyType;

public class Butterfly extends ConcreteAnimal {

  private Butterfly butterfly;
  private ButterflyType butterflyType;

  public Butterfly() {
  }

  public Butterfly(ButterflyType butterflyType) {
    this.setButterflyType(butterflyType);
    this.setButterfly(new CaterpillarButterfly());
  }

  public void setButterflyType(ButterflyType butterflyType) {
    this.butterflyType = butterflyType;
  }

  public void setButterfly(Butterfly butterfly) {
    this.butterfly = butterfly;
  }

  public Butterfly getButterfly() {
    return butterfly;
  }

  public void convertToButterfly() {
    this.setButterfly(new ConcreteButterfly());
  }
}
