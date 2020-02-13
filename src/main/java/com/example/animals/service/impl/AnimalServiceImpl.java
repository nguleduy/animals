package com.example.animals.service.impl;

import com.example.animals.model.ConcreteAnimal;
import com.example.animals.repository.AnimalRepository;
import com.example.animals.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

  @Autowired
  AnimalRepository animalRepository;

  @Override
  public List<ConcreteAnimal> findAllAnimals() {
    return animalRepository.findAll();
  }
}
