package com.edu.apiEducation.cursos;

import java.time.LocalDate;

import com.edu.apiEducation.nivelExperiencia.NivelExperiencia;
import com.edu.apiEducation.trilha.Trilha;

public record CadastrarDadosCursos(
		String descricaoCurso,
		int tempoCurso,
		String imagemCurso, 
		String observacao,
	    Boolean ativo,
	    LocalDate dataExclusao,
	    String observacaoExclusao,
	    Trilha trilha,
	    NivelExperiencia nivelExperiencia
		) {

}
