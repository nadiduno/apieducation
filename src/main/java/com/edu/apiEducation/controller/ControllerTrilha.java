package com.edu.apiEducation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trilha.CadastrarDadosTrilha;

@RestController
@RequestMapping("/trilha")
public class ControllerTrilha {

	@GetMapping
	public String mostarTrilha() {
		return "Trilhas";
	}
	
	//@PostMapping
	//public String cadastrarTrilha(@RequestBody String json) {
		
		//System.out.println(json);
		//return (json);
	//}
	
	@PostMapping
	public CadastrarDadosTrilha cadastrarTrilha(@RequestBody  CadastrarDadosTrilha dados) {
		
		System.out.println(dados);
		return (dados);
	}
}
