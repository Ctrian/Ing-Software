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
@Table(name = "calificacion")
public class Calificacion {

	@Id
	@SequenceGenerator(name = "seq_calificacion", sequenceName = "seq_calificacion", allocationSize = 1)
	@GeneratedValue(generator = "seq_calificacion", strategy = GenerationType.SEQUENCE)
	@Column(name = "cali_id")
	private Integer id;
	@Column(name = "cali_cedula")
	private String cedula;
	@Column(name = "cali_nombre")
	private String nombre;
	@Column(name = "cali_apellido")
	private String apellido;
	@Column(name = "cali_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "cali_genero")
	private String genero;
	@Column(name = "cali_registro")
	private String registro;

	// relaciones
	@ManyToOne(cascade = CascadeType.ALL)
	// tabla de rompimiento en la entidad secundaria
	@JoinColumn(name = "cali_id_estudiante")
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

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public String getRegistro() {
		return registro;
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

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	// toString
	@Override
	public String toString() {
		return "Calificacion [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", registro=" + registro + "]";
	}

}
