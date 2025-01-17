package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import trilha.CadastrarDadosTrilha;
//import trilha.TrilhaService;

@RestController
@RequestMapping("/trilha")
public class TrilhaController {

	@GetMapping
	public String mostarTrilha() {
		return "Trilhas";
	}
	
	@PostMapping
	public String cadastrarTrilha(@RequestBody String json) {
		System.out.println(json);
		return (json);
	}
	 
}
