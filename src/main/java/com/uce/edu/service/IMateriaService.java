package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Materia;

public interface IMateriaService {
	
public Materia buscar(String codigo);
	
	public void registrar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public void eliminar(String codigo);
	
	public List<Materia> buscarTodos();
	

}
