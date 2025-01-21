package com.edu.apiEducation.aulas;

import java.net.URI;
import java.time.LocalDate;

import com.edu.apiEducation.cursos.Cursos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	private URI linkAula;
	private String observacao;
    private Boolean ativo;
    private LocalDate dataExclusao;
    private String observacaoExclusao;
    
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Cursos curso;
	
	public Aulas(CadastrarDadosAulas dados) {
		this.descricaoAula = dados.descricaoAula();
		this.linkAula= dados.linkAula();
		this.observacao = dados.observacao();
		this.ativo = dados.ativo();
		this.dataExclusao = dados.dataExclusao();
		this.observacaoExclusao = dados.observacaoExclusao();
		this.curso = dados.curso();
	}

}
