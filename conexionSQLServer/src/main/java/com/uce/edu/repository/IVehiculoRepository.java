package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Vehiculo;

public interface IVehiculoRepository {

	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public Vehiculo encontrar(Integer id);

	public void eliminar(Integer id);

	// encontrar todos
	public List<Vehiculo> encontrarTodosVehi();

	// encontrar todos disponibles
	public List<Vehiculo> encontrarVehiDisponibles();

	// encontrar por marca y modelo
	public List<Vehiculo> encontrarMarcaModelo(String marca, String modelo);

	// encontrar por placa
	public Vehiculo encontrarPlaca(String placa);

	// encontrar por placa lista
	public List<Vehiculo> encontrarPlacaList(String placa);

	// encontrar por placa y modelo
	public List<Vehiculo> encontrarMarcayModeloList(String placa, String modelo);

	// actualizar el estadopor placa
	public Integer actEstado(String placa);

}
