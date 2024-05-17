package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

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
@Table(name = "matricular_estudiante")
public class MatricularEstudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_matricular_estudiante")
	@SequenceGenerator(name = "seq_matricular_estudiante", sequenceName = "seq_matricular_estudiante", allocationSize = 1)

	@Column(name = "maes_id")
	private Integer id;

	@Column(name = "maes_cedula")
	private String cedula;

	@Column(name = "maes_codigo_materia1")
	private String codigoMateria1;

	@Column(name = "maes_codigo_materia2")
	private String codigoMateria2;

	@Column(name = "maes_codigo_materia3")
	private String codigoMateria3;

	@Column(name = "maes_codigo_materia4")
	private String codigoMateria4;

	@Column(name = "maes_fecha_matricula")
	private LocalDateTime fechaMaricula;

	@Column(name = "maes_nombre_hilo")
	private String nombreHilo;

	@ManyToOne
	@JoinColumn(name = "maes_id_materia")
	private Materia materia;

	@ManyToOne
	@JoinColumn(name = "maes_id_estudiante")
	private Estudiante estudiante;

	// get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCodigoMateria1() {
		return codigoMateria1;
	}

	public void setCodigoMateria1(String codigoMateria1) {
		this.codigoMateria1 = codigoMateria1;
	}

	public String getCodigoMateria2() {
		return codigoMateria2;
	}

	public void setCodigoMateria2(String codigoMateria2) {
		this.codigoMateria2 = codigoMateria2;
	}

	public String getCodigoMateria3() {
		return codigoMateria3;
	}

	public void setCodigoMateria3(String codigoMateria3) {
		this.codigoMateria3 = codigoMateria3;
	}

	public String getCodigoMateria4() {
		return codigoMateria4;
	}

	public void setCodigoMateria4(String codigoMateria4) {
		this.codigoMateria4 = codigoMateria4;
	}

	public LocalDateTime getFechaMaricula() {
		return fechaMaricula;
	}

	public void setFechaMaricula(LocalDateTime fechaMaricula) {
		this.fechaMaricula = fechaMaricula;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}
