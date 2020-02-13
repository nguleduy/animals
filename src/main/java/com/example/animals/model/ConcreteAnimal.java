package com.example.animals.model;

import com.example.animals.model.constant.Color;
import com.example.animals.model.constant.Size;
import com.example.animals.service.Animal;

public class ConcreteAnimal implements Animal {

  private boolean male;
  private Size size;
  private Color color;
  private String language;

  public boolean isMale() {
    return male;
  }

  public void setMale(boolean male) {
    this.male = male;
  }

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
