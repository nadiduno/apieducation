package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.aulaProfessor.AulaProfessor;
import com.edu.apiEducation.aulaProfessor.AulaProfessorRepository;
import com.edu.apiEducation.aulaProfessor.CadastrarDadosAulaProfessor;

@RestController
@RequestMapping("/aulaprofessor")
public class AulaProfessorController {

	@Autowired
	private AulaProfessorRepository repository;
	
	@GetMapping
	public String mostarAulaProfessor() {
		return "Aula Professor";
	}
	
	@PostMapping
	public CadastrarDadosAulaProfessor cadastrarAulaProfessor(@RequestBody CadastrarDadosAulaProfessor dados) {
		repository.save(new AulaProfessor(dados));
		return (dados);
	}
}
