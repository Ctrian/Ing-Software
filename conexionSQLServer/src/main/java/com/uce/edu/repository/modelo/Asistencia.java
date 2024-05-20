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
@Table(name = "asistencia")
public class Asistencia {

	@Id
	@SequenceGenerator(name = "seq_asistencia", sequenceName = "seq_asistencia", allocationSize = 1)
	@GeneratedValue(generator = "seq_asistencia", strategy = GenerationType.SEQUENCE)
	@Column(name = "asis_id")
	private Integer id;
	@Column(name = "asis_cedula")
	private String cedula;
	@Column(name = "asis_nombre")
	private String nombre;
	@Column(name = "asis_apellido")
	private String apellido;
	@Column(name = "asis_fecha")
	private LocalDateTime fecha;
	@Column(name = "asis_asiste")
	private boolean asiste;

	// relaciones
	@ManyToOne(cascade = CascadeType.ALL)
	// tabla de rompimiento en la entidad secundaria
	@JoinColumn(name = "asis_id_estudiante")
	private Estudiante estudiante;

	// get y set
	public Integer getId() {
		return id;
	}

	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public boolean isAsiste() {
		return asiste;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public void setAsiste(boolean asiste) {
		this.asiste = asiste;
	}

	// toString
	@Override
	public String toString() {
		return "Asistencia [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fecha=" + fecha + ", asiste=" + asiste + "]";
	}
}
