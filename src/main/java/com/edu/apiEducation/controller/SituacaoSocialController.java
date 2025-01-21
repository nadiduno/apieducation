package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.situacaoSocial.CadastrarDadosSituacaoSocial;
import com.edu.apiEducation.situacaoSocial.SituacaoSocial;
import com.edu.apiEducation.situacaoSocial.SituacaoSocialRepository;

@RestController
@RequestMapping("/situacaoSocial")
public class SituacaoSocialController {

	@Autowired
	private SituacaoSocialRepository repository;
	
	@GetMapping
	public String mostarSituacaoSocial() {
		return "Cursos";
	}
	
	@PostMapping
	public CadastrarDadosSituacaoSocial cadastrarSituacaoSocial(@RequestBody CadastrarDadosSituacaoSocial dados) {
		repository.save(new SituacaoSocial(dados));
		return (dados);
	}
	 
}