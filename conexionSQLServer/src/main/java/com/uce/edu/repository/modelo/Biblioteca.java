package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "biblioteca")
public class Biblioteca {

	@Id
	@SequenceGenerator(name = "seq_biblioteca", sequenceName = "seq_biblioteca", allocationSize = 1)
	@GeneratedValue(generator = "seq_biblioteca", strategy = GenerationType.SEQUENCE)
	@Column(name = "bibl_id")
	private Integer id;
	@Column(name = "bibl_nombre")
	private String nombre;
	@Column(name = "bibl_direccion")
	private String direccion;
	@Column(name = "bibl_registro")
	private String registro;

	// relaciones

	// get y set
	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getRegistro() {
		return registro;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	// toString
	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", registro=" + registro
				+ "]";
	}
}
