package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repository.modelo.Bodega;

public interface IBodegaService {
	
	public Bodega buscar(String codigo);

	public void guardar(Bodega bodega);

	public void actualizar(Bodega bodega);

	public void eliminar(String codigo);
}
