package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

// tabla de rompimiento entre estudiante y profesor

@Entity
@Table(name = "calendario")
public class Calendario {

	@Id
	@SequenceGenerator(name = "seq_calendario", sequenceName = "seq_calendario", allocationSize = 1)
	@GeneratedValue(generator = "seq_calendario", strategy = GenerationType.SEQUENCE)
	@Column(name = "cale_id")
	private Integer id;
	@Column(name = "cale_pension")
	private String cedula;
	@Column(name = "cale_nombre")
	private String nombre;
	@Column(name = "cale_apellido")
	private String apellido;
	@Column(name = "cale_fecha_inicio")
	private LocalDateTime fechaInicio;
	@Column(name = "cale_fecha_fin")
	private LocalDateTime fechaFin;
	@Column(name = "cale_registro")
	private String registro;

	// relaciones

	// get y set
	public Integer getId() {
		return id;
	}

	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public String getRegistro() {
		return registro;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	// toString
	@Override
	public String toString() {
		return "Calendario [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", registro=" + registro + "]";
	}
}
