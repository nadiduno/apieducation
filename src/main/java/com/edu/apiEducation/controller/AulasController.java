package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.aulas.CadastrarDadosAulas;



//import trilha.CadastrarDadosTrilha;
//import trilha.TrilhaService;

@RestController
@RequestMapping("/aulas")
public class AulasController {

	@GetMapping
	public String mostarAulas() {
		return "Aulas";
	}
	
	@PostMapping
	public CadastrarDadosAulas cadastrarAulas(@RequestBody CadastrarDadosAulas json) {
		System.out.println(json);
		return (json);
	}
	 
}
