package com.edu.apiEducation.pessoas;

import java.time.LocalDate;

public record CadastrarDadosPessoas(
		String nome, 
		String sobrenome, 
		String cpf, 
		LocalDate dataNascimento, 
		Sexo sexo, 
		String email, 
		String senha, 
		String telefone, 
		String cep, 
		String bairro, 
		String cidade, 
		String estado, 
		String numeroResidencia, 
		GrauInstrucao grauInstrucao, 
		Integer numeroFilhos, 
		SituacaoFamiliar situacaoFamiliar, 
		Raca raca, 
		Boolean deficiencia, 
		TipoDeficiencia tipoDeficiencia
		) {
	
}
