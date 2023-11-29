package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Inventario;

public interface IInventarioRepository {
	public Inventario selecionar(String codigo);

	public void insertar(Inventario inventario);

	public void actualizar(Inventario inventario);

	public void eliminar(String codigo);
}
