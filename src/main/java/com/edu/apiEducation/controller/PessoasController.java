package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.pessoas.Pessoas;
import com.edu.apiEducation.pessoas.PessoasRepository;
import com.edu.apiEducation.pessoas.CadastrarDadosPessoas;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {
	@Autowired
	private PessoasRepository repository;
	
	@GetMapping
	public String mostarPessoas() {
		return "Pessoas";
	}
	
	@PostMapping
	public CadastrarDadosPessoas cadastrarPessoas(@RequestBody CadastrarDadosPessoas dados) {
		repository.save(new Pessoas(dados));
		return (dados);
	}
}
