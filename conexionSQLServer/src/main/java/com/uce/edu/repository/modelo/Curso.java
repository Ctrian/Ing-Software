package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@SequenceGenerator(name = "seq_curso", sequenceName = "seq_curso", allocationSize = 1)
	@GeneratedValue(generator = "seq_curso", strategy = GenerationType.SEQUENCE)
	@Column(name = "curs_id")
	private int id;
	@Column(name = "curs_nombre")
	private String nombre;

	// relaciones
//	@ManyToOne(cascade = CascadeType.ALL)
//	// tabla de rompimiento
//	@JoinColumn(name = "curs_id_estu")
	// private Estudiante estudiante;

	// @JoinColumn(name = "curs_id_materia")
	// private Materia materia;

	// get y set
	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	public Estudiante getEstudiante() {
//		return estudiante;
//	}

//	public Materia getMateria() {
//		return materia;
//	}

//	public void setEstudiante(Estudiante estudiante) {
//		this.estudiante = estudiante;
//	}

//	public void setMateria(Materia materia) {
//		this.materia = materia;
//	}

	// toString
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + "]";
	}

}
