package com.generation.rento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.rento.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
		
	public List<Produto> findAllBynomeServicoContainingIgnoreCase (String nomeServico);
		
	}
