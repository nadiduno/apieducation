package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.cursos.CadastrarDadosCursos;
import com.edu.apiEducation.cursos.Cursos;
import com.edu.apiEducation.cursos.CursosRepository;


//import trilha.CadastrarDadosTrilha;
//import trilha.TrilhaService;

@RestController
@RequestMapping("/cursos")
public class CursosController {

	@Autowired
	private CursosRepository repository;
	
	@GetMapping
	public String mostarCursos() {
		return "Cursos";
	}
	
	@PostMapping
	public CadastrarDadosCursos cadastrarCursos(@RequestBody CadastrarDadosCursos dados) {
		repository.save(new Cursos(dados));
		return (dados);
	}
	 
}
