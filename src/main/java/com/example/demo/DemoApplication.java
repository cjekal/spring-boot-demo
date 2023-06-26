package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("this is the second repo!");
		System.out.println("I am on the main branch.");
		SpringApplication.run(DemoApplication.class, args);
	}

}
