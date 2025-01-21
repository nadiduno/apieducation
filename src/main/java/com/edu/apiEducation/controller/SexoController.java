package com.edu.apiEducation.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.sexo.CadastrarDadosSexo;
import com.edu.apiEducation.sexo.DadosListagemSexo;
import com.edu.apiEducation.sexo.Sexo;
import com.edu.apiEducation.sexo.SexoRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/sexo")
public class SexoController {

	@Autowired
	private SexoRepository repository;
	
	@GetMapping
	public List<DadosListagemSexo> listar() {
	    return repository.findAll().stream()
	            .map(DadosListagemSexo::new)
	            .collect(Collectors.toList());
	}
	
	@PostMapping
	@Transactional
	public CadastrarDadosSexo cadastrarSexo(@RequestBody CadastrarDadosSexo dados) {
		repository.save(new Sexo(dados));
		return (dados);
	}
	 
}
