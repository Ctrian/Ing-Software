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
@Table(name = "administracion")
public class Administracion {
	@Id
	@SequenceGenerator(name = "seq_administracion", sequenceName = "seq_administracion", allocationSize = 1)
	@GeneratedValue(generator = "seq_administracion", strategy = GenerationType.SEQUENCE)
	@Column(name = "admi_id")
	private Integer id;
	@Column(name = "admi_cedula")
	private String cedula;
	@Column(name = "admi_nombre")
	private String nombre;
	@Column(name = "admi_apellido")
	private String apellido;
	@Column(name = "admi_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "admi_genero")
	private String genero;
	@Column(name = "admi_registro")
	private String registro;
	@Column(name = "admi_area")
	private String area_cargo;

	// relaciones
	@OneToMany(mappedBy = "administracion", cascade = CascadeType.ALL)
	private List<Admi_Prof> admi_Profs;

	@OneToMany(mappedBy = "administracion", cascade = CascadeType.ALL)
	private List<PlanEstudio> planEstudios;

	@OneToOne(cascade = CascadeType.ALL)
	// tabla de rompimiento en la entidad secundaria
	@JoinColumn(name = "admi_id_rector")
	private Rector rector;

	@OneToOne(mappedBy = "administracion", cascade = CascadeType.ALL)
	private Contabilidad contabilidad;

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

	public String getArea_cargo() {
		return area_cargo;
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

	public void setArea_cargo(String area_cargo) {
		this.area_cargo = area_cargo;
	}

	// toString
}