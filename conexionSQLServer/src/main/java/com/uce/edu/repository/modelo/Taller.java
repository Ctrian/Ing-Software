package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "taller")
public class Taller {
	@Id
	@SequenceGenerator(name = "seq_taller", sequenceName = "seq_taller", allocationSize = 1)
	@GeneratedValue(generator = "seq_taller", strategy = GenerationType.SEQUENCE)

	@Column(name = "tall_id")
	private Integer id;

	@Column(name = "tall_nombre")
	private String nombre;

	@Column(name = "tall_descripcion")
	private String descripcion;

	@Column(name = "tall_fecha")
	private LocalDateTime fecha;

	@Column(name = "tall_hora")
	private String hora;

	@Column(name = "tall_lugar")
	private String lugar;

	// relaciones
	@OneToMany(mappedBy = "taller", cascade = CascadeType.ALL)
	private List<PagoPension> pagoPensions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tall_id_estudiante")
	private Estudiante estudiante;

	// get y set
	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getHora() {
		return hora;
	}

	public String getLugar() {
		return lugar;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	// toString
}