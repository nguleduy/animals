package com.example.animals.repository;

import com.example.animals.model.ConcreteAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository<T extends ConcreteAnimal> extends JpaRepository<T, Long> {
}
