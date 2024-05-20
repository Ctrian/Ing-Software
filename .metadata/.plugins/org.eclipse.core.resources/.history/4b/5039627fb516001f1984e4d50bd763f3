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
@Table(name = "plan_estudio")
public class PlanEstudio {

	@Id
	@SequenceGenerator(name = "seq_plan_estudio", sequenceName = "seq_plan_estudio", allocationSize = 1)
	@GeneratedValue(generator = "seq_plan_estudio", strategy = GenerationType.SEQUENCE)
	@Column(name = "plan_id")
	private Integer id;
	@Column(name = "plan_tipo_pension")
	private String tipoPension;
	@Column(name = "plan_anio_academico")
	private String anioAcademico;
	@Column(name = "plan_nombre")
	private String nombre;
	@Column(name = "plan_descripcion")
	private String descripcion;
	@Column(name = "plan_costo")
	private int costo;
	@Column(name = "plan_fecha_inicio")
	private LocalDateTime fechaInicio;
	@Column(name = "plan_fecha_fin")
	private LocalDateTime fechaFin;
	@Column(name = "plan_requisitos_graduacion")
	private String requisitosGraduacion;

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

	public String getRequisitosGraduacion() {
		return requisitosGraduacion;
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

	public void setRequisitosGraduacion(String requisitosGraduacion) {
		this.requisitosGraduacion = requisitosGraduacion;
	}

	// toString
	@Override
	public String toString() {
		return "PlanEstudio [id=" + id + ", tipoPension=" + tipoPension + ", anioAcademico=" + anioAcademico
				+ ", nombre=" + nombre + ", descripcion=" + descripcion + ", costo=" + costo + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", requisitosGraduacion=" + requisitosGraduacion + "]";
	}
}
