package com.edu.apiEducation.estudantes;

import java.time.LocalDate;

import com.edu.apiEducation.grauInstrucao.GrauInstrucao;
import com.edu.apiEducation.raca.Raca;
import com.edu.apiEducation.rendaFamiliar.RendaFamiliar;
import com.edu.apiEducation.sexo.Sexo;
import com.edu.apiEducation.situacaoFamiliar.SituacaoFamiliar;
import com.edu.apiEducation.situacaoSocial.SituacaoSocial;
import com.edu.apiEducation.tipoDeficiencia.TipoDeficiencia;
public record CadastrarDadosEstudantes(
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
		Boolean computador,
		Boolean internet,
		String observacao,
		Boolean ativo,
	    LocalDate dataExclusao,
	    String observacaoExclusao,
	    Sexo sexo,
	    Raca raca,
	    TipoDeficiencia tipoDeficiencia,
		GrauInstrucao grauInstrucao,
		SituacaoFamiliar situacaoFamiliar,
		RendaFamiliar rendaFamiliar,
		SituacaoSocial situacaoSocial
		) {

}
