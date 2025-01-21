package com.edu.apiEducation.aulas;

import java.net.URI;
import java.time.LocalDate;

import com.edu.apiEducation.cursos.Cursos;

public record CadastrarDadosAulas(
		String descricaoAula,
		URI linkAula,  
		String observacao,
		Boolean ativo,
	    LocalDate dataExclusao,
	    String observacaoExclusao,
	    Cursos curso
		) {

}
