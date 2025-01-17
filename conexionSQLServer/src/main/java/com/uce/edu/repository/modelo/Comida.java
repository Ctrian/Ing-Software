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
@Table(name = "comida")
public class Comida {

	@Id
	@SequenceGenerator(name = "seq_comida", sequenceName = "seq_comida", allocationSize = 1)
	@GeneratedValue(generator = "seq_comida", strategy = GenerationType.SEQUENCE)
	@Column(name = "comi_id")
	private Integer id;
	@Column(name = "comi_tipo_pension")
	private String tipo_pension;
	@Column(name = "comi_nombre")
	private String nombre;
	@Column(name = "comi_fecha_entrega")
	private LocalDateTime fechaEntrega;
	@Column(name = "comi_lugar_entrega")
	private String lugarEntrega;
	@Column(name = "comi_registro")
	private String registro;

	// relaciones

	// get y set
	public Integer getId() {
		return id;
	}

	public String getTipo_pension() {
		return tipo_pension;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}

	public String getLugarEntrega() {
		return lugarEntrega;
	}

	public String getRegistro() {
		return registro;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTipo_pension(String tipo_pension) {
		this.tipo_pension = tipo_pension;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public void setLugarEntrega(String lugarEntrega) {
		this.lugarEntrega = lugarEntrega;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	// toString
	@Override
	public String toString() {
		return "Comida [id=" + id + ", tipo_pension=" + tipo_pension + ", nombre=" + nombre + ", fechaEntrega="
				+ fechaEntrega + ", lugarEntrega=" + lugarEntrega + ", registro=" + registro + "]";
	}

}
