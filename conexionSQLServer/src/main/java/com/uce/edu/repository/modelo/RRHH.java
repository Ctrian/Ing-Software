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

// profesores y directivos

@Entity
@Table(name = "rrhh")
public class RRHH {

	@Id
	@SequenceGenerator(name = "seq_rrhh", sequenceName = "seq_rrhh", allocationSize = 1)
	@GeneratedValue(generator = "seq_rrhh", strategy = GenerationType.SEQUENCE)
	@Column(name = "rrhh_id")
	private Integer id;
	@Column(name = "rrhh_nombre")
	private String nombre;
	@Column(name = "rrhh_apellido")
	private String apellido;
	@Column(name = "rrhh_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "rrhh_genero")
	private String genero;
	@Column(name = "rrhh_direccion")
	private String direccion;
	@Column(name = "rrhh_telefono")
	private String telefono;
	@Column(name = "rrhh_cargo")
	private String cargo;
	@Column(name = "rrhh_salario")
	private String salario;
	@Column(name = "rrhh_fecha_contratacion")
	private LocalDateTime fechaContratacion;

	// relaciones
	@ManyToOne(cascade = CascadeType.ALL)
	// tabla de rompimiento en la entidad secundaria
	@JoinColumn(name = "rrhh_id_rector")
	private Rector rector;

	// get y set
	public Integer getId() {
		return id;
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

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCargo() {
		return cargo;
	}

	public String getSalario() {
		return salario;
	}

	public LocalDateTime getFechaContratacion() {
		return fechaContratacion;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public void setFechaContratacion(LocalDateTime fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	// toString
	@Override
	public String toString() {
		return "RRHH [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", genero=" + genero + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", cargo=" + cargo + ", salario=" + salario + ", fechaContratacion=" + fechaContratacion + "]";
	}
}
