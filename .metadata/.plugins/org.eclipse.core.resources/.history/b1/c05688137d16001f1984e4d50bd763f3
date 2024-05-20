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
@Table(name = "examen")
public class Examen {

	@Id
	@SequenceGenerator(name = "seq_examen", sequenceName = "seq_examen", allocationSize = 1)
	@GeneratedValue(generator = "seq_examen", strategy = GenerationType.SEQUENCE)
	@Column(name = "exam_id")
	private Integer id;
	@Column(name = "exam_duracion")
	private int duracion;
	@Column(name = "exam_puntaje")
	private int puntaje;
	@Column(name = "exam_fecha")
	private LocalDateTime fecha;
	@Column(name = "exam_registro")
	private String registro;
	
	// relaciones
	
	// get y set
	public Integer getId() {
		return id;
	}
	public int getDuracion() {
		return duracion;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public String getRegistro() {
		return registro;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	// toString
	@Override
	public String toString() {
		return "Examen [id=" + id + ", duracion=" + duracion + ", puntaje=" + puntaje + ", fecha=" + fecha
				+ ", registro=" + registro + "]";
	}
}
