package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.raca.CadastrarDadosRaca;
import com.edu.apiEducation.raca.Raca;
import com.edu.apiEducation.raca.RacaRepository;

@RestController
@RequestMapping("/raca")
public class RacaController {

	@Autowired
	private RacaRepository repository;
	
	@GetMapping
	public String mostarRaca() {
		return "Raça";
	}
	
	@PostMapping
	public CadastrarDadosRaca cadastrarRaca(@RequestBody CadastrarDadosRaca dados) {
		repository.save(new Raca(dados));
		return (dados);
	}
	 
}