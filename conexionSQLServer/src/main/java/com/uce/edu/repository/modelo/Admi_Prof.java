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

@Entity
@Table(name = "admi_prof")
public class Admi_Prof {
	@Id
	@SequenceGenerator(name = "seq_admi_prof", sequenceName = "seq_admi_prof", allocationSize = 1)
	@GeneratedValue(generator = "seq_admi_prof", strategy = GenerationType.SEQUENCE)
	@Column(name = "adpr_id")
	private Integer id;

	// relaciones
	@ManyToOne(cascade = CascadeType.ALL)
	// aquí va la tabla de rompimiento
	@JoinColumn(name = "adpr_id_administrativo")
	private Administracion administracion;

	@ManyToOne
	@JoinColumn(name = "adpr_id_profesor")
	private Profesor profesor;

	// get y set
	public Integer getId() {
		return id;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Administracion getAdministracion() {
		return administracion;
	}

	public void setAdministracion(Administracion administracion) {
		this.administracion = administracion;
	}

	// toString
}