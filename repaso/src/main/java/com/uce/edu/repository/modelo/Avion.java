package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_avion")
	@SequenceGenerator(name = "seq_avion", sequenceName = "seq_avion", allocationSize = 1)

	@Column(name = "avio_id")
	private int id;

	@Column(name = "avio_numero")
	private int numero;

	@Column(name = "avio_capacidad_asientos")
	private int cantidad_asientos;

	@ManyToOne
	@JoinColumn(name = "avion_id_vuelo")
	private Vuelo vuelo;

	// get y set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCantidad_asientos() {
		return cantidad_asientos;
	}

	public void setCantidad_asientos(int cantidad_asientos) {
		this.cantidad_asientos = cantidad_asientos;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", numero=" + numero + ", cantidad_asientos=" + cantidad_asientos + ", vuelo="
				+ vuelo + "]";
	}

}
