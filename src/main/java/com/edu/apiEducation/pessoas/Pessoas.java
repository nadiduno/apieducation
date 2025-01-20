package com.edu.apiEducation.pessoas;

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
import java.time.LocalDate;

@Table(name = "pessoas2")
@Entity(name = "Pessoas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idPessoa")
public class Pessoas {
		
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPessoa;
	private String nome;
	private String sobrenome;
	private String cpf;
	private LocalDate dataNascimento;
	@Enumerated(EnumType.STRING)
    private Sexo sexo;
	private String email;
	private String senha;
	private String telefone;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String numeroResidencia;
	@Enumerated(EnumType.STRING)
    private GrauInstrucao grauInstrucao;
	private Integer numeroFilhos;
	@Enumerated(EnumType.STRING)
    private SituacaoFamiliar situacaoFamiliar;
	@Enumerated(EnumType.STRING)
    private Raca raca;
	private Boolean deficiencia;
	@Enumerated(EnumType.STRING)
    private TipoDeficiencia tipoDeficiencia;
	@Enumerated(EnumType.STRING)
	private RendaFamiliar rendaFamiliar;
	@Enumerated(EnumType.STRING)
	private SituacaoSocial situacaoSocial;
	private Boolean computador;
	private Boolean internet;
	private String observacao;
	
	public Pessoas(CadastrarDadosPessoas dados) {
		this.nome = dados.nome();
		this.sobrenome = dados.sobrenome();
		this.cpf = dados.cpf();
		this.dataNascimento = dados.dataNascimento();
		this.sexo = dados.sexo();
		this.email = dados.email();
		this.senha = dados.senha();
		this.telefone = dados.telefone();
		this.cep = dados.cep();
		this.bairro = dados.bairro();
		this.cidade = dados.cidade();
		this.estado = dados.estado();
		this.numeroResidencia = dados.numeroResidencia();
		this.grauInstrucao = dados.grauInstrucao();
		this.numeroFilhos = dados.numeroFilhos();
		this.situacaoFamiliar = dados.situacaoFamiliar();
		this.raca = dados.raca();
		this.deficiencia = dados.deficiencia();
		this.tipoDeficiencia = dados.tipoDeficiencia();
		this.rendaFamiliar = dados.rendaFamiliar();
		this.situacaoSocial = dados.situacaoSocial();
		this.computador = dados.computador();
		this.internet = dados.internet();
		this.observacao = dados.observacao();
					    
	}
	
}