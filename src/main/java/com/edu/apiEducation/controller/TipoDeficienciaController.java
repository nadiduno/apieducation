package com.edu.apiEducation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.apiEducation.tipoDeficiencia.CadastrarDadosTipoDeficiencia;
import com.edu.apiEducation.tipoDeficiencia.TipoDeficiencia;
import com.edu.apiEducation.tipoDeficiencia.TipoDeficienciaRepository;

@RestController
@RequestMapping("/tipoDeficiencia")
public class TipoDeficienciaController {

	@Autowired
	private TipoDeficienciaRepository repository;
	
	@GetMapping
	public String mostarTipoDeficiencia() {
		return "Cursos";
	}
	
	@PostMapping
	public CadastrarDadosTipoDeficiencia cadastrarTipoDeficiencia(@RequestBody CadastrarDadosTipoDeficiencia dados) {
		repository.save(new TipoDeficiencia(dados));
		return (dados);
	}
	 
}