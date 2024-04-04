package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Apirest1Application {
	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(Apirest1Application.class, args);
		System.out.println();
		System.out.println("Funcionando correctamente API REST");
		System.out.println();
	}
}
