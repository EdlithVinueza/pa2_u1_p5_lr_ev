package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Producto;

public interface IProductoRepository {
	public Producto selecionar(String codigoBarras);

	public void insertar(Producto producto);

	public void actualizar(Producto producto);

	public void eliminar(String codigoBarras);
}
