package com.uce.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class Pa2U1P5LrEvApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5LrEvApplication.class, args);
	}
	@Override
	public void run(String...args) throws Exception{
		System.out.println("Hola Mundo");
		System.out.println("Soy Leonardo Ramirez y Edlith Vinueza");
		System.out.println("Cambio en la misma Rama");
		System.out.println("Cambio en una nueva rama taller 3");
		System.out.println("Nuevo Cambio");
		System.out.println("Taller 4 version 2");
		
	}
	
}
