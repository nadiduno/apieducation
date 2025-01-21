package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.professores.CadastrarDadosProfessores;
import com.edu.apiEducation.professores.Professores;
import com.edu.apiEducation.professores.ProfessoresRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/professores")
public class ProfessoresController {
	@Autowired
	private ProfessoresRepository repository;
	
	@GetMapping
	public String mostarProfessores() {
		return "Professores";
	}
	
	@PostMapping
	public CadastrarDadosProfessores cadastrarProfessores(@Valid @RequestBody CadastrarDadosProfessores dados) {
		repository.save(new Professores(dados));
		return (dados);
	}
}
