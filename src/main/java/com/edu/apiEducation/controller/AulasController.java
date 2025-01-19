package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.aulas.Aulas;
import com.edu.apiEducation.aulas.AulasRepository;
import com.edu.apiEducation.aulas.CadastrarDadosAulas;


@RestController
@RequestMapping("/aulas")
public class AulasController {

	@Autowired
	private AulasRepository repository;
	
	@GetMapping
	public String mostarAulas() {
		return "Aulas";
	}
	
	@PostMapping
	public CadastrarDadosAulas cadastrarAulas(@RequestBody CadastrarDadosAulas dados) {
		//System.out.println(json);
		repository.save(new Aulas(dados));
		return (dados);
	}
	 
}
