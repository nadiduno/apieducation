package com.edu.apiEducation.aulas;

import java.net.URI;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "aulas")
@Entity(name = "Aulas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idAula")
public class Aulas {
		
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAula;
	private String descricaoAula;
	private URI link_aula;
	private long idCurso;
	long idProfessor;
	private String observacao;
	
	public Aulas(CadastrarDadosAulas dados) {
		this.descricaoAula = dados.descricao_aula();
		this.link_aula = dados.link_aula();
		this.idCurso = dados.id_curso();
		this.idProfessor = dados.id_professor();
		this.observacao = dados.observacao();
	}
	
}
