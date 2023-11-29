package com.uce.edu.inventario.repository.modelo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Inventario {

	private String codigoString;
	private LocalDateTime fechaIngreso;
	private Bodega bodega;
	private Producto producto;

	// SET Y GET
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getCodigoString() {
		return codigoString;
	}

	public void setCodigoString(String codigoString) {
		this.codigoString = codigoString;
	}

	@Override
	public String toString() {
		return "Inventario [codigoString=" + codigoString + ", fechaIngreso=" + fechaIngreso + ", bodega=" + bodega
				+ ", producto=" + producto + "]";
	}

}
