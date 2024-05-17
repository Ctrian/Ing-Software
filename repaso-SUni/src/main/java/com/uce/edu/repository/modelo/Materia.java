package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materia")
	@SequenceGenerator(name = "seq_materia", sequenceName = "seq_materia", allocationSize = 1)

	@Column(name = "mate_id")
	private Integer id;

	@Column(name = "mate_nombre")
	private String nombre;

	@Column(name = "mate_codigo")
	private String codigo;

	@Column(name = "mate_numero_creditos")
	private BigDecimal numero_creditos;

	@Column(name = "mate_cedula_profesor")
	private String cedula_profesor;

	@OneToMany(mappedBy = "materia")
	private List<MatricularEstudiante> matriculas;

	// get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getNumero_creditos() {
		return numero_creditos;
	}

	public void setNumero_creditos(BigDecimal numero_creditos) {
		this.numero_creditos = numero_creditos;
	}

	public String getCedula_profesor() {
		return cedula_profesor;
	}

	public void setCedula_profesor(String cedula_profesor) {
		this.cedula_profesor = cedula_profesor;
	}

	public List<MatricularEstudiante> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<MatricularEstudiante> matriculas) {
		this.matriculas = matriculas;
	}

}
