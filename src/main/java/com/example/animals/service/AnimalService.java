package com.example.animals.service;

import com.example.animals.model.ConcreteAnimal;

import java.util.List;

public interface AnimalService {

  List<ConcreteAnimal> findAllAnimals();

}
