package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IMateriaRepository;
import com.uce.edu.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService{
	
	@Autowired 
	private IMateriaRepository iMateriaRepository;

	@Override
	public Materia buscar(String codigo) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.seleccionar(codigo);
	}

	@Override
	public void registrar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.insertar(materia);
		
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.actualizar(materia);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.borrar(codigo);
		
	}

	@Override
	public List<Materia> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.sleccionarTodos();
	}

}
