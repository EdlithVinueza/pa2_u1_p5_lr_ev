package com.uce.edu.inventario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.uce.edu.inventario.repository.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {
	private static List<Inventario> base = new ArrayList<Inventario>();
	@Override
	public Inventario selecionar(String codigo) {
		// TODO Auto-generated method stub
				for (Inventario inventario : base) {
					if (inventario.getCodigoString().equals(codigo)) {
						Inventario cta = new Inventario();
						cta.setBodega(inventario.getBodega());
						cta.setCodigo(inventario.getCodigoString());
						cta.setFechaIngreso(inventario.getFechaIngreso());
						cta.setProducto(inventario.getProducto());
						return cta;
					}
				}
	
		return null;
	}
	
	public Inventario selecionarEliminar(String codigo) {
		for (Inventario inventario : base) {
			if (inventario.getCodigoString().equals(codigo)) {
				return inventario;
			}
		}
		return null;
	}

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		base.add(inventario);
	}

	@Override
	public void actualizar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.eliminar(inventario.getCodigoString());
		this.insertar(inventario);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		Inventario inventario = this.selecionarEliminar(codigo);
		base.remove(inventario);
	}

}
