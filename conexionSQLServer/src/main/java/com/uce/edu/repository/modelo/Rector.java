package com.uce.edu.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "rector")
public class Rector {
	@Id
	@SequenceGenerator(name = "seq_rector", sequenceName = "seq_rector", allocationSize = 1)
	@GeneratedValue(generator = "seq_rector", strategy = GenerationType.SEQUENCE)
	@Column(name = "rect_id")
	private Integer id;
	@Column(name = "rect_anio_academico")
	private String anioAcademico;
	@Column(name = "rect_nombre")
	private String nombre;
	@Column(name = "rect_apellido")
	private String apellido;
	@Column(name = "rect_nombre_institucion")
	private String nombreInstitucion;

	// relaciones
	@OneToOne(mappedBy = "rector", cascade = CascadeType.ALL)
	private Administracion administracion;

	@OneToOne(mappedBy = "rector", cascade = CascadeType.ALL)
	private Calendario calendario;

	@OneToOne(mappedBy = "rector", cascade = CascadeType.ALL)
	private Biblioteca biblioteca;

	@OneToMany(mappedBy = "rector", cascade = CascadeType.ALL)
	private List<RRHH> rrhhs;

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
}