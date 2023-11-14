package com.uce.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ioc.di.Estudiante;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class Pa2U1P5LrEvApplication implements CommandLineRunner{
    
	@Autowired
	private Estudiante estudiante; 
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5LrEvApplication.class, args);
	}
	@Override
	public void run(String...args) throws Exception{
		this.estudiante.setCedula("1723353825 y 1751674027");
		this.estudiante.setNombre("Leonardo y Edlith ");
		this.estudiante.setApellido("Ramirez y Vinueza ");
		this.estudiante.setSalario(new BigDecimal(1000));
		System.out.println(estudiante);
		
	}
	
}
