package com.uce.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.inventario.repository.IInventarioRepository;
import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.inventario.repository.modelo.Producto;
import com.uce.edu.inventario.service.IBodegaService;
import com.uce.edu.inventario.service.IInventarioService;
import com.uce.edu.inventario.service.IProductoService;
import com.uce.edu.ioc.di.Estudiante;
import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;
import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import com.uce.edu.transferencia.service.ICuentaBancariaService;
import com.uce.edu.transferencia.service.ITransferenciaService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Pa2U1P5LrEvApplication implements CommandLineRunner {
	@Autowired
	private IProductoService iProductoService;
	@Autowired
	private IBodegaService iBodegaService;
	@Autowired
	private IInventarioService iInventarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5LrEvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Producto p1 = new Producto();
		p1.setCodigoBoarra("123456");
		p1.setNombre("HP 15 laptop");
		p1.setStock(0);
		
		this.iProductoService.guardar(p1);
		
		Producto p2 = new Producto();
		p2.setCodigoBoarra("546515646");
		p2.setNombre("Teclado HP ");
		p2.setStock(0);
		
		this.iProductoService.guardar(p2);
		
		Bodega b1 = new Bodega();
		b1.setCodigo("12365854");
		b1.setNombre("Bodega 1");
		b1.setDireccion("Quito");
		b1.setCapacidad(1000);
		
		this.iBodegaService.guardar(b1);
		
		System.out.println("Antes de editar");
		System.out.println(this.iProductoService.Buscar(p1.getCodigoBoarra()));
		System.out.println(this.iProductoService.Buscar(p2.getCodigoBoarra()));
		
		this.iInventarioService.registar(b1.getCodigo(), p1.getCodigoBoarra(), 50);
		this.iInventarioService.registar(b1.getCodigo(), p2.getCodigoBoarra(), 100);
		this.iInventarioService.registar(b1.getCodigo(), p1.getCodigoBoarra(), 20);
		
		System.out.println("Despues de editar");
		System.out.println(this.iProductoService.Buscar(p1.getCodigoBoarra()));
		System.out.println(this.iProductoService.Buscar(p2.getCodigoBoarra()));
		
	} 
	
}
