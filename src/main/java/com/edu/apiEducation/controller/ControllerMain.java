package com.edu.apiEducation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class ControllerMain {
	
	@GetMapping
	public String cursos() {
		return "Cursos - Mulherada Tech";
	}
}
