package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.cursos.CadastrarDadosCursos;


//import trilha.CadastrarDadosTrilha;
//import trilha.TrilhaService;

@RestController
@RequestMapping("/cursos")
public class CursosController {

	@GetMapping
	public String mostarCursos() {
		return "Cursos";
	}
	
	@PostMapping
	public CadastrarDadosCursos cadastrarCursos(@RequestBody CadastrarDadosCursos json) {
		System.out.println(json);
		return (json);
	}
	 
}
