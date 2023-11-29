package com.uce.edu.inventario.repository.modelo;

import org.springframework.stereotype.Component;

@Component
public class Producto {

	private String nombre;
	private Integer stock;
	private String codigoBoarra;

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getCodigoBoarra() {
		return codigoBoarra;
	}

	public void setCodigoBoarra(String codigoBoarra) {
		this.codigoBoarra = codigoBoarra;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", stock=" + stock + ", codigoBoarra=" + codigoBoarra + "]";
	}

}
