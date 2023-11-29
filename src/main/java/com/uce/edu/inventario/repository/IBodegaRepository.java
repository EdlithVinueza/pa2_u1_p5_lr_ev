package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Bodega;

public interface IBodegaRepository {
	public Bodega selecionar(String codigo);

	public void insertar(Bodega bodega);

	public void actualizar(Bodega bodega);

	public void eliminar(String codigo);
}
