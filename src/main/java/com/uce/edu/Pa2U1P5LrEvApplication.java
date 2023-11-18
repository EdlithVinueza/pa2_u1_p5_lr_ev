package com.uce.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ioc.di.Estudiante;
import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class Pa2U1P5LrEvApplication implements CommandLineRunner{
	
	@Autowired
	private IMateriaService iMateriaService;
    @Autowired
	private Materia materia;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5LrEvApplication.class, args);
	}
	@Override
	public void run(String...args) throws Exception{
		this.materia.setCodigo("M1");
		this.materia.setNombre("P. Avanzada");
		this.materia.setNumeroCreditos(10);
		
		this.iMateriaService.registrar(materia);
		
		System.out.println("Reporte inicio");
		
		List<Materia> reporteList = this.iMateriaService.buscarTodos();
		for (Materia mat: reporteList) {
			System.out.println(mat);
		}
		
		Materia mate = this.iMateriaService.buscar("M1");
		System.out.println(mate);
		
		mate.setNumeroCreditos(20);
		
		this.iMateriaService.actualizar(mate);
		Materia mate2 = this.iMateriaService.buscar("M1");
		System.out.println(mate2);
		
		this.iMateriaService.eliminar("M1");
		
		mate2=this.iMateriaService.buscar("M1");
		System.out.println(mate2);
	
	}
	
}
