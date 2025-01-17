package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagar")
public class Pagar {

	@Id
	@SequenceGenerator(name = "seq_pagar", sequenceName = "seq_pagar", allocationSize = 1)
	@GeneratedValue(generator = "seq_pagar", strategy = GenerationType.SEQUENCE)
	@Column(name = "paga_id")
	private Integer id;
	@Column(name = "paga_fecha")
	private LocalDateTime fecha;
	@Column(name = "paga_registro")
	private boolean registro;

	// relaciones

	// get y set
	public Integer getId() {
		return id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public boolean isRegistro() {
		return registro;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public void setRegistro(boolean registro) {
		this.registro = registro;
	}

	// toString
	@Override
	public String toString() {
		return "Pagar [id=" + id + ", fecha=" + fecha + ", registro=" + registro + "]";
	}
}
