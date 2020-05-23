package com.example.joke.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"/Controllers","/Services"})
public class JokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeAppApplication.class, args);
	}

}
