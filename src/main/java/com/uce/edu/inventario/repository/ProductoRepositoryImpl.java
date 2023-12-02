package com.uce.edu.inventario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.inventario.repository.modelo.Inventario;
import com.uce.edu.inventario.repository.modelo.Producto;
@Repository
public class ProductoRepositoryImpl implements IProductoRepository{
	private static List<Producto> base = new ArrayList<Producto>();
	@Override
	public Producto selecionar(String codigo) {
		// TODO Auto-generated method stub
		for (Producto producto : base) {
			if (producto.getCodigoBoarra().equals(codigo)) {
				Producto cta = new Producto();
				cta.setCodigoBoarra(producto.getCodigoBoarra());
				cta.setNombre(producto.getNombre());
				cta.setStock(producto.getStock());
	
				return cta;
			}
		}

		return null;
	}
	
	public Producto selecionarEliminar(String codigo) {
		for (Producto producto : base) {
			if (producto.getCodigoBoarra().equals(codigo)) {
				return producto;
			}
		}
		return null;
	}

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		base.add(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.eliminar(producto.getCodigoBoarra());
		this.insertar(producto);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		Producto producto  = this.selecionarEliminar(codigo);
		base.remove(producto);
	}

}
