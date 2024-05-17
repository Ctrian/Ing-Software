package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vuelo")
	@SequenceGenerator(name = "seq_vuelo", sequenceName = "seq_vuelo", allocationSize = 1)

	@Column(name = "vuel_id")
	private Integer id;

	@Column(name = "vuel_numero")
	private String numero;

	@Column(name = "vuel_fecha_vuelo")
	private String fecha_vuelo;

	@Column(name = "vuel_asientos_disponibles")
	private Integer asientos_disponibles;

	@Column(name = "vuel_valor_asiento")
	private BigDecimal valor_asiento;

	@Column(name = "vuel_estado_vuelo")
	private String estado_vuelo;

	@OneToMany(mappedBy = "vuelo")
	private List<Avion> aviones;
	
	// get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFecha_vuelo() {
		return fecha_vuelo;
	}

	public void setFecha_vuelo(String fecha_vuelo) {
		this.fecha_vuelo = fecha_vuelo;
	}

	public Integer getAsientos_disponibles() {
		return asientos_disponibles;
	}

	public void setAsientos_disponibles(Integer asientos_disponibles) {
		this.asientos_disponibles = asientos_disponibles;
	}

	public BigDecimal getValor_asiento() {
		return valor_asiento;
	}

	public void setValor_asiento(BigDecimal valor_asiento) {
		this.valor_asiento = valor_asiento;
	}

	public String getEstado_vuelo() {
		return estado_vuelo;
	}

	public void setEstado_vuelo(String estado_vuelo) {
		this.estado_vuelo = estado_vuelo;
	}

	public List<Avion> getAviones() {
		return aviones;
	}

	public void setAviones(List<Avion> aviones) {
		this.aviones = aviones;
	}
	
}
