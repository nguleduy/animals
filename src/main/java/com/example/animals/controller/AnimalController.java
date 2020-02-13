package com.example.animals.controller;

import com.example.animals.model.ConcreteAnimal;
import com.example.animals.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api")
public class AnimalController {

  @Autowired
  AnimalService animalService;

  @GetMapping(value = "/animals")
  public ResponseEntity<?> findAllAnimals() {
    List<ConcreteAnimal> animals = animalService.findAllAnimals();
    if (Objects.isNull(animals)) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(animals, HttpStatus.OK);
  }

}
