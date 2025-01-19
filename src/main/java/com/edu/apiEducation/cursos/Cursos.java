package com.edu.apiEducation.cursos;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cursos")
@Entity(name = "Cursos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idCurso")
public class Cursos {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCurso;
	private String descricaoCurso; 
	@Enumerated(EnumType.STRING)
	private NivelExperiencia nivelExperiencia; 
	private int tempoCurso;
	private String imagemCurso; 
	@Enumerated(EnumType.STRING)
	private DescricaoTrilha descricao_trilha;
	
	public Cursos(CadastrarDadosCursos dados) {
		this.descricaoCurso = dados.descricao_curso();
		this.nivelExperiencia = dados.nivel_experiencia();
		this.tempoCurso = dados.tempo_curso();
		this.imagemCurso = dados.imagem_curso();
		this.descricao_trilha = dados.descricao_trilha();
		
	}
}
