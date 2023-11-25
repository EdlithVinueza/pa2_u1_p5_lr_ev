package com.uce.edu.transferencia.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
@Repository
public class CuentaBancariaIRepositoryImpl implements ICuentaBancariaRepository {
	
	private static List<CuentaBancaria> base= new ArrayList<CuentaBancaria>();

	@Override
	public CuentaBancaria selecionar(String nuemro) {
	
		for(CuentaBancaria cuenta : base) {
			if (cuenta.getNumero().equals(nuemro)) {
				CuentaBancaria ctaBancaria = new CuentaBancaria();
				ctaBancaria.setCedulaPropietario(cuenta.getCedulaPropietario());
				ctaBancaria.setNumero(cuenta.getNumero());
				ctaBancaria.setSaldo(cuenta.getSaldo());
				return ctaBancaria;
			}
		}
		return null;
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		base.add(cuentaBancaria);
		
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		this.eliminar(cuentaBancaria.getNumero());
		this.insertar(cuentaBancaria);
		
	}

	@Override
	public void eliminar(String numero) {
		CuentaBancaria cuentaBancaria = this.selecionar(numero);
		base.remove(cuentaBancaria);
	
	}

}
