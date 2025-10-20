package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoOpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpApplication.class, args);
		
		System.out.println("Esto es una demostracion de modificacion de archivo para Spring Boot");
		System.out.println("Realizado por Sonia González Almenara de 2º DAM");
	}

}
