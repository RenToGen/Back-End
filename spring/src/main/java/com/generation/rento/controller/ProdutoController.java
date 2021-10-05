package com.generation.rento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.rento.model.Produto;
import com.generation.rento.repository.ProdutoRepository;



	@RestController
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/produto")
	public class ProdutoController {
		
		@Autowired
		private ProdutoRepository repository;
		
		//EndPoints
		
		//busca todas produtos
			@GetMapping
			public ResponseEntity<List<Produto>> getAll(){
				return ResponseEntity.ok(repository.findAll());
			}
			
			//busca produtos pelo id
			@GetMapping("/{id}")
			public ResponseEntity<Produto> getById(@PathVariable long id){
				return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
						.orElse(ResponseEntity.notFound().build());
			}
			
			//busca categorias pelo nome de servico
			@GetMapping("/servico/{nomeServico}")
			public ResponseEntity<List<Produto>> getByName(@PathVariable String nomeServico){
				return ResponseEntity.ok(repository.findAllBynomeServicoContainingIgnoreCase(nomeServico));
			}
			
			//Post 
			@PostMapping
			public ResponseEntity<Produto> post (@RequestBody Produto produto){
				return ResponseEntity.status(HttpStatus.CREATED)
						.body(repository.save(produto));
			}

			@PutMapping
			public ResponseEntity<Produto> put (@RequestBody Produto produto){
				return ResponseEntity.ok(repository.save(produto));				
			}
			
			@DeleteMapping("/{id}")
			public void delete(@PathVariable long id) {
				repository.deleteById(id);
			}

	}
