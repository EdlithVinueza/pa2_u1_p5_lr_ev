package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Materia;

public interface IMateriaRepository {
	
	public Materia seleccionar(String codigo);
	
	public void insertar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public void borrar(String codigo);
	
}
