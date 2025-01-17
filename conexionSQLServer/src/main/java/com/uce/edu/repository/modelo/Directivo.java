package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "directivo")
public class Directivo {
	@Id
	@SequenceGenerator(name = "seq_directivo", sequenceName = "seq_directivo", allocationSize = 1)
	@GeneratedValue(generator = "seq_directivo", strategy = GenerationType.SEQUENCE)
	@Column(name = "dire_id")
	private Integer id;
	@Column(name = "dire_anio_academico")
	private String anioAcademico;
	@Column(name = "dire_nombre")
	private String nombre;
	@Column(name = "dire_apellido")
	private String apellido;
	@Column(name = "dire_nombre_institucion")
	private String nombreInstitucion;

	// relaciones

	// get y set
	public Integer getId() {
		return id;
	}

	public String getAnioAcademico() {
		return anioAcademico;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAnioAcademico(String anioAcademico) {
		this.anioAcademico = anioAcademico;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}

	// toString
	@Override
	public String toString() {
		return "Directivo [id=" + id + ", anioAcademico=" + anioAcademico + ", nombre=" + nombre + ", apellido="
				+ apellido + ", nombreInstitucion=" + nombreInstitucion + "]";
	}
}
