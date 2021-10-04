package com.generation.rento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message="O valor não pode Ser nulo")
	@Size(min = 10, max = 500, message = "O texto tem que conter de 10 a 500 caracteres")
	private String descricao;

	@NotNull(message="O valor não pode Ser nulo")
	@Size(min = 50, max = 500, message = "O texto tem que conter de 50 a 500 caracteres")
	private String descricao_prestador;

	@NotNull(message="O valor não pode Ser nulo")
	private double valor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
