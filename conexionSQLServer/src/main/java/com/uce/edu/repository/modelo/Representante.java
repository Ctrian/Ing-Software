package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "representante")
public class Representante {

	@Id
	@SequenceGenerator(name = "seq_representante", sequenceName = "seq_representante", allocationSize = 1)
	@GeneratedValue(generator = "seq_representante", strategy = GenerationType.SEQUENCE)
	@Column(name = "repr_id")
	private Integer id;
	@Column(name = "repr_cedula")
	private String cedula;
	@Column(name = "repr_nombre")
	private String nombre;
	@Column(name = "repr_apellido")
	private String apellido;
	@Column(name = "repr_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "repr_genero")
	private String genero;
	@Column(name = "repr_registro")
	private String registro;

	// relaciones

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
		return "Representante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", registro=" + registro + "]";
	}
}
