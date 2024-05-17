package com.uce.edu.service;

import com.uce.edu.repository.modelo.Reserva;

public interface IPagoService {
	public void realizarPago(String numTarjeta, Reserva reserva);

}
