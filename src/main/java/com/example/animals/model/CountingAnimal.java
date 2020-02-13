package com.example.animals.model;

import com.example.animals.service.*;

public class CountingAnimal {

  public void countingAnimal(Animal[] animals) {
    int canFly = 0;
    int canSwim = 0;
    int canWalk = 0;
    int canSing = 0;

    for (Animal animal : animals) {
      if (animal instanceof CanWalk) {
        canWalk++;
      }
      if (animal instanceof CanSing) {
        canSing++;
      }
      if (animal instanceof CanSwim) {
        canSwim++;
      }
      if (animal instanceof CanFly) {
        canFly++;
      }
      if (animal instanceof Butterfly) {
        ((Butterfly) animal).convertToButterfly();
      }
      if (animal instanceof Butterfly && (((Butterfly) animal).getButterfly() instanceof CanFly)) {
        canFly++;
      }
    }

    System.out.println("can fly : " + canFly);
    System.out.println("can walk : " + canWalk);
    System.out.println("can sing : " + canSing);
    System.out.println("can swim : " + canSwim);
  }

}
