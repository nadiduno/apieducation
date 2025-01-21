package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.AulaEstudante.AulaEstudante;
import com.edu.apiEducation.AulaEstudante.AulaEstudanteRepository;
import com.edu.apiEducation.AulaEstudante.CadastrarDadosAulaEstudante;

@RestController
@RequestMapping("/aulaEstudante")
public class AulaEstudanteController {

	@Autowired
	private AulaEstudanteRepository repository;
	
	@GetMapping
	public String mostarAulaEstudante() {
		return "Aula Estudante";
	}
	
	@PostMapping
	public CadastrarDadosAulaEstudante cadastrarAulaEstudante(@RequestBody CadastrarDadosAulaEstudante dados) {
		repository.save(new AulaEstudante(dados));
		return (dados);
	}
	 
}