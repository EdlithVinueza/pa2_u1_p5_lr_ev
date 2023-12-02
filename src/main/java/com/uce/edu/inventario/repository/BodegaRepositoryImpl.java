package com.uce.edu.inventario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repository.modelo.Bodega;

@Repository
public class BodegaRepositoryImpl implements IBodegaRepository{
	private static List<Bodega> base = new ArrayList<Bodega>();
	
	@Override
	public Bodega selecionar(String codigo) {
		// TODO Auto-generated method stub
		for (Bodega bodega : base) {
			if (bodega.getCodigo().equals(codigo)) {
				Bodega cta = new Bodega();
				cta.setCapacidad(bodega.getCapacidad());
				cta.setCodigo(bodega.getCodigo());
				cta.setDireccion(bodega.getDireccion());
				cta.setNombre(bodega.getNombre());
			
				return cta;
			}
		}
		return null;
	}
	
	public Bodega selecionarEliminar(String codigo) {
		for (Bodega bodega : base) {
			if (bodega.getCodigo().equals(codigo)) {
				return bodega;
			}
		}
		return null;
	}


	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		base.add(bodega);
		
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.eliminar(bodega.getCodigo());
		this.insertar(bodega);
	}
		
	

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		Bodega bodega = this.selecionarEliminar(codigo);
		base.remove(bodega);
	}

}
