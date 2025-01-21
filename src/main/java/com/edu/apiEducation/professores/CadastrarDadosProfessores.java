package com.edu.apiEducation.professores;

import java.time.LocalDate;

import com.edu.apiEducation.grauInstrucao.GrauInstrucao;
import com.edu.apiEducation.raca.Raca;
import com.edu.apiEducation.sexo.Sexo;
import com.edu.apiEducation.situacaoFamiliar.SituacaoFamiliar;
import com.edu.apiEducation.tipoDeficiencia.TipoDeficiencia;

public record CadastrarDadosProfessores(
		String nome, 
		String sobrenome, 
		String cpf, 
		LocalDate dataNascimento, 
		String email, 
		String senha, 
		String telefone, 
		String cep, 
		String bairro, 
		String cidade, 
		String estado, 
		String numeroResidencia,  
		Integer numeroFilhos,  
		Boolean deficiencia, 
		String observacao,
		Boolean ativo,
	    LocalDate dataExclusao,
	    String observacaoExclusao,
	    Sexo sexo,
	    Raca raca,
	    TipoDeficiencia tipoDeficiencia,
		GrauInstrucao grauInstrucao,
		SituacaoFamiliar situacaoFamiliar
		) {
	
}
