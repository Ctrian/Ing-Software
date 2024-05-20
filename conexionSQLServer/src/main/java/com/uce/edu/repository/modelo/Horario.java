package com.uce.edu.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

// material escolar

@Entity
@Table(name = "horario")
public class Horario {

	@Id
	@SequenceGenerator(name = "seq_horario", sequenceName = "seq_horario", allocationSize = 1)
	@GeneratedValue(generator = "seq_horario", strategy = GenerationType.SEQUENCE)
	@Column(name = "hora_id")
	private Integer id;

	// relaciones
	@ManyToOne(cascade = CascadeType.ALL)
	// aquí va tabla de rompimiento
	@JoinColumn(name = "hora_id_profesor")
	private Profesor profesor;

	@ManyToOne
	@JoinColumn(name = "hora_id_materia")
	private Materia materia;

	// get y set
	public Integer getId() {
		return id;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	// toString
}
