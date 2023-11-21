package com.uce.edu.repository.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Materia {
	private String nombre;
	private String codigo;
	private Integer numeroCreditos;
	
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", numeroCreditos=" + numeroCreditos + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}
	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}
	
	

}
