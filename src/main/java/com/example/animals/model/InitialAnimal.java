package com.example.animals.model;

import com.example.animals.model.constant.AnimalType;
import com.example.animals.model.constant.ParrotType;

public class InitialAnimal {

  public ConcreteAnimal initial(AnimalType animalType) {
    switch (animalType) {
      case BIRD:
        return new Bird();
      case CHICKEN:
        return new Chicken(false);
      case ROOSTER:
        return new Chicken(true);
      case DUCK:
        return new Duck();
      case PARROT_WITH_DOG:
        return new Parrot(ParrotType.DOG);
      case PARROT_WITH_CAT:
        return new Parrot(ParrotType.CAT);
      case PARROT_WITH_DUCK:
        return new Parrot(ParrotType.DUCK);
      case PARROT_WITH_ROOSTER:
        return new Parrot(ParrotType.ROOSTER);
      case PARROT_WITH_PHONE:
        return new Parrot(ParrotType.PHONE);
      case SHARK:
        return new Shark();
      case CLOWN_FISH:
        return new Clownfish();
      case DOLPHIN:
        return new Dolphin();
      default:
        return null;
    }
  }
}
