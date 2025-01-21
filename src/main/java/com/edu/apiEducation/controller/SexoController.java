package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.sexo.CadastrarDadosSexo;
import com.edu.apiEducation.sexo.Sexo;
import com.edu.apiEducation.sexo.SexoRepository;

@RestController
@RequestMapping("/sexo")
public class SexoController {

	@Autowired
	private SexoRepository repository;
	
	@GetMapping
	public String mostarSexo() {
		return "Sexo";
	}
	
	@PostMapping
	public CadastrarDadosSexo cadastrarSexo(@RequestBody CadastrarDadosSexo dados) {
		repository.save(new Sexo(dados));
		return (dados);
	}
	 
}
