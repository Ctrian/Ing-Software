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
@Table(name = "contabilidad")
public class Contabilidad {

	@Id
	@SequenceGenerator(name = "seq_contabilidad", sequenceName = "seq_contabilidad", allocationSize = 1)
	@GeneratedValue(generator = "seq_contabilidad", strategy = GenerationType.SEQUENCE)
	@Column(name = "conta_id")
	private Integer id;
	@Column(name = "conta_descripcion")
	private String descripcion;
	@Column(name = "contabilidad_monto")
	private String monto;
	@Column(name = "contabilidad_fecha")
	private LocalDateTime fecha;
	@Column(name = "contabilidad_estado_transaccion")
	private String estadoTransaccion;
	@Column(name = "contabilidad_metodo_pago")
	private String metodo_pago;

	// relaciones

	// get y set
	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getMonto() {
		return monto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getEstadoTransaccion() {
		return estadoTransaccion;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public void setEstadoTransaccion(String estadoTransaccion) {
		this.estadoTransaccion = estadoTransaccion;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	// toString
	@Override
	public String toString() {
		return "Contabilidad [id=" + id + ", descripcion=" + descripcion + ", monto=" + monto + ", fecha=" + fecha
				+ ", estadoTransaccion=" + estadoTransaccion + ", metodo_pago=" + metodo_pago + "]";
	}
}
