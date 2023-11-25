package com.uce.edu.transferencia.repository.modelo;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class CuentaBancaria {
	private String numero;
	private String cedulaPropietario;
	private BigDecimal saldoBig;
	
	//SET Y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCedulaPropietario() {
		return cedulaPropietario;
	}
	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	public BigDecimal getSaldoBig() {
		return saldoBig;
	}
	public void setSaldoBig(BigDecimal saldoBig) {
		this.saldoBig = saldoBig;
	}

}
