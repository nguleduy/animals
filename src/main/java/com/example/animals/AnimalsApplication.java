package com.example.animals;

import com.example.animals.model.Bird;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsApplication.class, args);
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
