package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "prof_admi")
public class Prof_Admi {
	@Id
	@SequenceGenerator(name = "seq_prof_admin", sequenceName = "seq_prof_admin", allocationSize = 1)
	@GeneratedValue(generator = "seq_prof_admin", strategy = GenerationType.SEQUENCE)
	@Column(name = "prad_id")
	private Integer id;

	// relaciones
	// @ManyToOne(cascade = CascadeType.ALL)
	// tabla de rompimiento
	// @JoinColumn(name = "prad_id_profesor")
	// private Profesor profesor;

	// @JoinColumn(name = "prad_id_administrativo")
	// private Administrativo administrativo;

	// get y set
	public Integer getId() {
		return id;
	}

//	public Profesor getProfesor() {
//		return profesor;
//	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public void setProfesor(Profesor profesor) {
//		this.profesor = profesor;
//	}

//	public Administrativo getAdministrativo() {
//		return administrativo;
//	}
//
//	public void setAdministrativo(Administrativo administrativo) {
//		this.administrativo = administrativo;
//	}

	// toString
//	@Override
//	public String toString() {
//		return "Prof_Admi [id=" + id + ", administrativo=" + administrativo + "]";
//	}

}
