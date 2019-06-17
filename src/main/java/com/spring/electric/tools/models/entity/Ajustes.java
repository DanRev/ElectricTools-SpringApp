package com.spring.electric.tools.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AJUSTES")
public class Ajustes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TXT_ENCABEZADO",length = 5000)
	private String txtEncabezado;
	
	@Column(name = "TXT_PIEPAGINA",length = 5000)
	private String txtPiePagina;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the txtEncabezado
	 */
	public String getTxtEncabezado() {
		return txtEncabezado;
	}

	/**
	 * @param txtEncabezado the txtEncabezado to set
	 */
	public void setTxtEncabezado(String txtEncabezado) {
		this.txtEncabezado = txtEncabezado;
	}

	/**
	 * @return the txtPiePagina
	 */
	public String getTxtPiePagina() {
		return txtPiePagina;
	}

	/**
	 * @param txtPiePagina the txtPiePagina to set
	 */
	public void setTxtPiePagina(String txtPiePagina) {
		this.txtPiePagina = txtPiePagina;
	}
}
