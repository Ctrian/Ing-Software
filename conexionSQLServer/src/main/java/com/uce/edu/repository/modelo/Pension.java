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
@Table(name = "pension")
public class Pension {

	@Id
	@SequenceGenerator(name = "seq_pension", sequenceName = "seq_pension", allocationSize = 1)
	@GeneratedValue(generator = "seq_pension", strategy = GenerationType.SEQUENCE)
	@Column(name = "pens_id")
	private Integer id;
	@Column(name = "pens_tipo_pension")
	private String tipoPension;
	@Column(name = "pens_anio_academico")
	private String anioAcademico;
	@Column(name = "pens_nombre")
	private String nombre;
	@Column(name = "pens_descripcion")
	private String descripcion;
	@Column(name = "pens_costo")
	private int costo;
	@Column(name = "pens_fecha_inicio")
	private LocalDateTime fechaInicio;
	@Column(name = "pens_fecha_fin")
	private LocalDateTime fechaFin;

	// relaciones

	// get y set
	public Integer getId() {
		return id;
	}

	public String getTipoPension() {
		return tipoPension;
	}

	public String getAnioAcademico() {
		return anioAcademico;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCosto() {
		return costo;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTipoPension(String tipoPension) {
		this.tipoPension = tipoPension;
	}

	public void setAnioAcademico(String anioAcademico) {
		this.anioAcademico = anioAcademico;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	// toString
	@Override
	public String toString() {
		return "Pension [id=" + id + ", tipoPension=" + tipoPension + ", anioAcademico=" + anioAcademico + ", nombre="
				+ nombre + ", descripcion=" + descripcion + ", costo=" + costo + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + "]";
	}
}
