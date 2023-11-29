package com.uce.edu.inventario.repository.modelo;

import org.springframework.stereotype.Component;

@Component
public class Bodega {

	private String codigo;
	private String nombre;
	private String direccion;
	private Integer capacidad;

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Bodega [codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", capacidad="
				+ capacidad + "]";
	}

}
