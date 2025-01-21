package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.grauInstrucao.CadastrarDadosGrauInstrucao;
import com.edu.apiEducation.grauInstrucao.GrauInstrucao;
import com.edu.apiEducation.grauInstrucao.GrauInstrucaoRepository;

@RestController
@RequestMapping("/grauInstrucao")
public class GrauInstrucaoController {

	@Autowired
	private GrauInstrucaoRepository repository;
	
	@GetMapping
	public String mostarGrauInstrucao() {
		return "Cursos";
	}
	
	@PostMapping
	public CadastrarDadosGrauInstrucao cadastrarGrauInstrucao(@RequestBody CadastrarDadosGrauInstrucao dados) {
		repository.save(new GrauInstrucao(dados));
		return (dados);
	}
	 
}