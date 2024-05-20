package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
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
@Table(name = "pago_pension")
public class PagoPension {

	@Id
	@SequenceGenerator(name = "seq_pago_pension", sequenceName = "seq_pago_pension", allocationSize = 1)
	@GeneratedValue(generator = "seq_pago_pension", strategy = GenerationType.SEQUENCE)

	@Column(name = "pape_id")
	private Integer id;
	@Column(name = "pape_fecha")
	private LocalDateTime fecha;
	@Column(name = "pape_tipo_pension")
	private String tipoPension;
	@Column(name = "pape_anio_academico")
	private String anioAcademico;
	@Column(name = "pape_nombre_pension")
	private String nombrePension;
	@Column(name = "pape_descripcion")
	private String descripcion;
	@Column(name = "pape_costo")
	private BigDecimal costo;
	@Column(name = "pape_fecha_inicio")
	private LocalDateTime fechaInicio;
	@Column(name = "pape_fecha_fin")
	private LocalDateTime fechaFin;
	@Column(name = "pape_registro")
	private boolean registro;

	// relaciones
	@ManyToOne(cascade = CascadeType.ALL)
	// aquí va la tabla de rompimiento
	@JoinColumn(name = "pape_id_contabilidad")
	private Contabilidad contabilidad;

	@ManyToOne
	@JoinColumn(name = "pape_id_representante")
	private Representante representante;

///////////////////////////////////////////////////////////////////

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pape_id_comida")
	private Comida comida;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pape_id_taller")
	private Taller taller;

	// get y set
	public Integer getId() {
		return id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public boolean isRegistro() {
		return registro;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public void setRegistro(boolean registro) {
		this.registro = registro;
	}

	// toString
}
