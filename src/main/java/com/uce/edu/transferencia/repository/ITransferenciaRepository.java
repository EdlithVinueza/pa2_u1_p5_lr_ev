package com.uce.edu.transferencia.repository;


import com.uce.edu.transferencia.repository.modelo.Transferencia;

public interface ITransferenciaRepository {
	//CRUD
	public Transferencia selecionar(String nuemro);
	public void insertar(Transferencia transferencia);
	public  void actualizar(Transferencia transferencia);
	public void eliminar(String numero);
}
