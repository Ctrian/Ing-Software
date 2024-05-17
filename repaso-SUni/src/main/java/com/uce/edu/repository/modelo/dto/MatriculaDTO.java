package com.uce.edu.repository.modelo.dto;

import java.time.LocalDateTime;

public class MatriculaDTO {
	private String cedulaEstudiante;
	private String codigoMateria;
	private LocalDateTime fecha;
	private String nombreHilo;

	public MatriculaDTO() {
		// TODO Auto-generated constructor stub
	}

	public MatriculaDTO(String cedulaEstudiante, String codigoMateria, LocalDateTime fecha,
			String nombreHilo) {
		super();
		this.cedulaEstudiante = cedulaEstudiante;
		this.codigoMateria = codigoMateria;
		this.fecha = fecha;
		this.nombreHilo = nombreHilo;
	}

	// get y set
	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public LocalDateTime getFechaMatricula() {
		return fecha;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fecha = fechaMatricula;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

}
