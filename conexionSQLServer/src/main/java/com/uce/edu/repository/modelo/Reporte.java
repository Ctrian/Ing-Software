package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

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
@Table(name = "reporte")
public class Reporte {

	@Id
	@SequenceGenerator(name = "seq_reporte", sequenceName = "seq_reporte", allocationSize = 1)
	@GeneratedValue(generator = "seq_reporte", strategy = GenerationType.SEQUENCE)
	@Column(name = "repo_id")
	private Integer id;

	@Column(name = "repo_fecha")
	private LocalDateTime fecha;

	@Column(name = "repo_calificacion")
	private String calificacion;

	@Column(name = "repo_observaciones")
	private String observaciones;

	// relaciones
	@ManyToOne(cascade = CascadeType.ALL)
	// aquí tengo la tabla de rompimiento
	@JoinColumn(name = "repo_id_profesor")
	private Profesor profesor;

	@ManyToOne
	@JoinColumn(name = "repo_id_estudiante")
	private Estudiante estudiante;
}
