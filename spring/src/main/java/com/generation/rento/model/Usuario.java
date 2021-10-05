package com.generation.rento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_usuario")
public class Usuario {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	

	@NotBlank(message="O valor não pode Ser nulo")
	@Size(min = 10, max = 150, message = "O texto tem que conter de 10 a 150 caracteres")
	private String nome;
	
	@NotBlank(message="O valor não pode Ser nulo")
	@Size(min = 8, max = 50, message = "O texto tem que conter de 8 a 50 caracteres")
	private String email;
	
	@NotBlank(message="O valor não pode Ser nulo")
	@Size(min = 1, max = 1, message = "Voce deve selecionar uma das opções")
	private char tipoCadastro ;
	
	@NotBlank(message="O valor não pode Ser nulo")
	@Size(min = 8, max = 20, message = "A senha tem que conter de 8 a 20 caracteres")
	private String senha ;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getTipoCadastro() {
		return tipoCadastro;
	}

	public void setTipoCadastro(char tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
