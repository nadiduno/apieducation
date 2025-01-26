package com.edu.apiEducation.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.edu.apiEducation.trilha.CadastrarDadosTrilha;
import com.edu.apiEducation.trilha.DadosListagemTrilha;
import com.edu.apiEducation.trilha.Trilha;
import com.edu.apiEducation.trilha.TrilhaRepository;

import jakarta.transaction.Transactional;
import lombok.Data;

@RestController
@RequestMapping("/trilha")
public class TrilhaController {

	@Autowired
	private TrilhaRepository repository;
	
	@GetMapping
	public List<DadosListagemTrilha> listar() {
	    return repository.findAll().stream()
	            .map(DadosListagemTrilha::new)
	            .collect(Collectors.toList());
	}
	
	@PostMapping
	@Transactional
	public CadastrarDadosTrilha cadastrarTrilha(@RequestBody CadastrarDadosTrilha dados) {
		repository.save(new Trilha(dados));
		return (dados);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public String excluirTrilha(@PathVariable Long id) {

		Logger logger = LoggerFactory.getLogger(TrilhaController.class);
		repository.deleteById(id);
		String message = String.format("Trilha %d eliminada com sucesso", id);
	    logger.info(message);
	    return message;
	}
	 
}