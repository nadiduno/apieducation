package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.situacaoFamiliar.CadastrarDadosSituacaoFamiliar;
import com.edu.apiEducation.situacaoFamiliar.SituacaoFamiliar;
import com.edu.apiEducation.situacaoFamiliar.SituacaoFamiliarRepository;

@RestController
@RequestMapping("/situacaoFamiliar")
public class SituacaoFamiliarController {

	@Autowired
	private SituacaoFamiliarRepository repository;
	
	@GetMapping
	public String mostarSituacaoFamiliar() {
		return "Situacao Familiar";
	}
	
	@PostMapping
	public CadastrarDadosSituacaoFamiliar cadastrarSituacaoFamiliar(@RequestBody CadastrarDadosSituacaoFamiliar dados) {
		repository.save(new SituacaoFamiliar(dados));
		return (dados);
	}
	 
}