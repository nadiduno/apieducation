package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.trilha.CadastrarDadosTrilha;
import com.edu.apiEducation.trilha.Trilha;
import com.edu.apiEducation.trilha.TrilhaRepository;

@RestController
@RequestMapping("/trilha")
public class TrilhaController {

	@Autowired
	private TrilhaRepository repository;
	
	@GetMapping
	public String mostarTrilha() {
		return "Trilha";
	}
	
	@PostMapping
	public CadastrarDadosTrilha cadastrarTrilha(@RequestBody CadastrarDadosTrilha dados) {
		repository.save(new Trilha(dados));
		return (dados);
	}
	 
}