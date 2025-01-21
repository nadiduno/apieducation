package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.estudantes.CadastrarDadosEstudantes;
import com.edu.apiEducation.estudantes.Estudantes;
import com.edu.apiEducation.estudantes.EstudantesRepository;

@RestController
@RequestMapping("/estudantes")
public class EstudantesController {

	@Autowired
	private EstudantesRepository repository;
	
	@GetMapping
	public String mostarEstudantes() {
		return "Estudantes";
	}
	
	@PostMapping
	public CadastrarDadosEstudantes cadastrarEstudantes(@RequestBody CadastrarDadosEstudantes dados) {
		repository.save(new Estudantes(dados));
		return (dados);
	}
	 
}
