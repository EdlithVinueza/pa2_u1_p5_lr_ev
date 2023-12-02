package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repository.modelo.Producto;

public interface IProductoService {
	public Producto Buscar(String codigoBarras);

	public void guardar(Producto producto);

	public void actualizar(Producto producto);

	public void eliminar(String codigoBarras);
}
