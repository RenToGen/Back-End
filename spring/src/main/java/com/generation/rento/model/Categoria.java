package com.generation.rento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 50, max = 500)
	private String descricao_tomador;

	@NotNull
	@Size(min = 50, max = 500)
	private String descricao_prestador;

	@NotNull
	private double valor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao_tomador() {
		return descricao_tomador;
	}

	public void setDescricao_tomador(String descricao_tomador) {
		this.descricao_tomador = descricao_tomador;
	}

	public String getDescricao_prestador() {
		return descricao_prestador;
	}

	public void setDescricao_prestador(String descricao_prestador) {
		this.descricao_prestador = descricao_prestador;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
