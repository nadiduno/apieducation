package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.rendaFamiliar.CadastrarDadosRendaFamiliar;
import com.edu.apiEducation.rendaFamiliar.RendaFamiliar;
import com.edu.apiEducation.rendaFamiliar.RendaFamiliarRepository;

@RestController
@RequestMapping("/rendaFamiliar")
public class RendaFamiliarController {

	@Autowired
	private RendaFamiliarRepository repository;
	
	@GetMapping
	public String mostarRendaFamiliar() {
		return "Renda Familiar";
	}
	
	@PostMapping
	public CadastrarDadosRendaFamiliar cadastrarRendaFamiliar(@RequestBody CadastrarDadosRendaFamiliar dados) {
		repository.save(new RendaFamiliar(dados));
		return (dados);
	}
	 
}