package com.generation.rento.repository;

import java.util.List;
import com.generation.rento.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
