package com.uce.edu.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPagoRepository;
import com.uce.edu.repository.modelo.Pago;
import com.uce.edu.repository.modelo.Reserva;

@Service
public class PagoServiceImpl implements IPagoService {

	@Autowired
	private IPagoRepository iPagoRepo;

	@Override
	public void realizarPago(String numTarjeta, Reserva reserva) {
		// TODO Auto-generated method stub
		Pago pago = new Pago();
		pago.setFecha(LocalDate.now());
		pago.setNumTarjeta(numTarjeta);
		pago.setReserva(reserva);

		this.iPagoRepo.insertar(pago);

	}

}
