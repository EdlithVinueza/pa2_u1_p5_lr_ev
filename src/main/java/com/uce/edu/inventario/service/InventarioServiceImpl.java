package com.uce.edu.inventario.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.inventario.repository.IBodegaRepository;
import com.uce.edu.inventario.repository.IInventarioRepository;
import com.uce.edu.inventario.repository.IProductoRepository;
import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.inventario.repository.modelo.Inventario;
import com.uce.edu.inventario.repository.modelo.Producto;
@Service
public class InventarioServiceImpl implements IInventarioService{
	
	@Autowired
	private IInventarioRepository inventarioRepository;
	
	@Autowired
	private IBodegaRepository iBodegaRepository;
	
	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public Inventario buscar(String codigo) {
		// TODO Auto-generated method stub
		return this.inventarioRepository.selecionar(codigo);
	}

	@Override
	public void guardar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepository.insertar(inventario);
	}

	@Override
	public void actualizar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepository.actualizar(inventario);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.inventarioRepository.eliminar(codigo);
	}

	@Override
	public void registar(String codigoBodega, String codigoBarras, Integer stok) {
		// TODO Auto-generated method stub
		Bodega bodega = this.iBodegaRepository.selecionar(codigoBodega);
		
		Producto producto = this.iProductoRepository.selecionar(codigoBarras);
		
		Integer stockActual = producto.getStock();
		Integer stockFinal =stockActual + stok;
		producto.setStock(stockFinal);
		
		this.iProductoRepository.actualizar(producto);
		
		Inventario inventario = new Inventario();
		
		inventario.setCodigo("54566416514");
		inventario.setFechaIngreso(LocalDateTime.now());
		inventario.setBodega(bodega);
		inventario.setProducto(producto);
		
		this.inventarioRepository.insertar(inventario);
	}

}
