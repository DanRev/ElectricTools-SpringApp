package com.spring.electric.tools.models.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.electric.tools.models.enums.OrdenEstado;

@Entity
@Table(name = "ORDENES")
public class Orden implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "FECHA_ENTRADA")
	private LocalDate fechaEntrada;

	@Column(name = "FECHA_SALIDA", nullable = true)
	private LocalDate fechaSalida;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@NotNull(message="cliente vacio")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) // Genera un proxy hacia la clase cliente
	@JoinColumn(name = "CLIENTE_ID")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) // Se ignoran en el JSON los atributos generados
	private Cliente cliente;										// por el proxy debido a LAZY	

	@Column(name = "NOMBRE_ARTICULO")
	private String nombreArticulo;

	@Column(name = "MARCA_ARTICULO")
	private String marcaArticulo;

	@Column(name = "MODELO_ARTICULO")
	private String modeloArticulo;

	@Column(name = "SERIAL_ARTICULO")
	private String serialArticulo;

	@Column(name = "PROBLEMA_REPORTADO")
	private String problemaReportado;

	@Column(name = "VALOR_ARREGLO", nullable = true)
	private Integer valorArreglo;
	
	@Column(name = "VALOR_RESPUESTOS", nullable = true)
	private Integer valorRepuestos;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ESTADO", nullable=false)
	private OrdenEstado estado;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fechaEntrada
	 */
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the fechaSalida
	 */
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the nombreArticulo
	 */
	public String getNombreArticulo() {
		return nombreArticulo;
	}

	/**
	 * @param nombreArticulo the nombreArticulo to set
	 */
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	/**
	 * @return the marcaArticulo
	 */
	public String getMarcaArticulo() {
		return marcaArticulo;
	}

	/**
	 * @param marcaArticulo the marcaArticulo to set
	 */
	public void setMarcaArticulo(String marcaArticulo) {
		this.marcaArticulo = marcaArticulo;
	}

	/**
	 * @return the modeloArticulo
	 */
	public String getModeloArticulo() {
		return modeloArticulo;
	}

	/**
	 * @param modeloArticulo the modeloArticulo to set
	 */
	public void setModeloArticulo(String modeloArticulo) {
		this.modeloArticulo = modeloArticulo;
	}

	/**
	 * @return the serialArticulo
	 */
	public String getSerialArticulo() {
		return serialArticulo;
	}

	/**
	 * @param serialArticulo the serialArticulo to set
	 */
	public void setSerialArticulo(String serialArticulo) {
		this.serialArticulo = serialArticulo;
	}

	/**
	 * @return the problemaReportado
	 */
	public String getProblemaReportado() {
		return problemaReportado;
	}

	/**
	 * @param problemaReportado the problemaReportado to set
	 */
	public void setProblemaReportado(String problemaReportado) {
		this.problemaReportado = problemaReportado;
	}

	/**
	 * @return the valorArreglo
	 */
	public Integer getValorArreglo() {
		return valorArreglo;
	}

	/**
	 * @param valorArreglo the valorArreglo to set
	 */
	public void setValorArreglo(Integer valorArreglo) {
		this.valorArreglo = valorArreglo;
	}

	/**
	 * @return the valorRepuestos
	 */
	public Integer getValorRepuestos() {
		return valorRepuestos;
	}

	/**
	 * @param valorRepuestos the valorRepuestos to set
	 */
	public void setValorRepuestos(Integer valorRepuestos) {
		this.valorRepuestos = valorRepuestos;
	}

	/**
	 * @return the estado
	 */
	public OrdenEstado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(OrdenEstado estado) {
		this.estado = estado;
	}
}
