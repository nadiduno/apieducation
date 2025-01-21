package com.edu.apiEducation.cursos;

import java.time.LocalDate;

import com.edu.apiEducation.nivelExperiencia.NivelExperiencia;
import com.edu.apiEducation.trilha.Trilha;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	private int tempoCurso;
	private String imagemCurso; 
	private String observacao;
    private Boolean ativo;
    private LocalDate dataExclusao;
    private String observacaoExclusao;
    
    @ManyToOne
    @JoinColumn(name = "idTrilha")
    private Trilha trilha;
    
    @ManyToOne
    @JoinColumn(name = "idNivelExperiencia")
    private NivelExperiencia nivelExperiencia; 
	
	
	public Cursos(CadastrarDadosCursos dados) {
		this.descricaoCurso = dados.descricaoCurso();
		this.tempoCurso = dados.tempoCurso();
		this.nivelExperiencia = dados.nivelExperiencia();
		this.imagemCurso = dados.imagemCurso();
		this.trilha = dados.trilha();
		this.observacao = dados.observacao();
		this.ativo = dados.ativo();
		this.dataExclusao = dados.dataExclusao();
		this.observacaoExclusao = dados.observacaoExclusao();
	}
}
