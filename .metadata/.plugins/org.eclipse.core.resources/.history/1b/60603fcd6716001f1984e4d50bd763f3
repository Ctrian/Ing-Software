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
@Table(name = "material_escolar")
public class MaterialEscolar {

	@Id
	@SequenceGenerator(name = "seq_material_escolar", sequenceName = "seq_material_escolar", allocationSize = 1)
	@GeneratedValue(generator = "seq_material_escolar", strategy = GenerationType.SEQUENCE)
	@Column(name = "maes_id")
	private Integer id;
	@Column(name = "maes_nombre")
	private String nombre;
	@Column(name = "maes_tipo_pension")
	private String tipo_pension;
	@Column(name = "maes_apellido")
	private String apellido;
	@Column(name = "maes_fecha_entrega")
	private LocalDateTime fechaEntrega;
	@Column(name = "maes_registro")
	private String registro;

	// relaciones

	// get y set
	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo_pension() {
		return tipo_pension;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
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

	public void setTipo_pension(String tipo_pension) {
		this.tipo_pension = tipo_pension;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	// toString
	@Override
	public String toString() {
		return "MaterialEscolar [id=" + id + ", nombre=" + nombre + ", tipo_pension=" + tipo_pension + ", apellido="
				+ apellido + ", fechaEntrega=" + fechaEntrega + ", registro=" + registro + "]";
	}
}
