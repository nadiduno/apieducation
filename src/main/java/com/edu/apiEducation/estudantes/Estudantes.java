package com.edu.apiEducation.estudantes;

import java.time.LocalDate;

import com.edu.apiEducation.grauInstrucao.GrauInstrucao;
import com.edu.apiEducation.raca.Raca;
import com.edu.apiEducation.rendaFamiliar.RendaFamiliar;
import com.edu.apiEducation.sexo.Sexo;
import com.edu.apiEducation.situacaoFamiliar.SituacaoFamiliar;
import com.edu.apiEducation.situacaoSocial.SituacaoSocial;
import com.edu.apiEducation.tipoDeficiencia.TipoDeficiencia;

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

@Table(name = "estudantes")
@Entity(name = "Estudantes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idEstudante")
public class Estudantes {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEstudante;
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private LocalDate dataNascimento;
	private String email;
	private String senha;
	private String telefone;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String numeroResidencia;
	private Integer numeroFilhos;
	private Boolean computador;
	private Boolean internet;
	private Boolean deficiencia;
	private String observacao;
    private Boolean ativo;
    private LocalDate dataExclusao;
    private String observacaoExclusao;
        
    @ManyToOne
    @JoinColumn(name = "idSexo")
    private Sexo sexo;
    
    @ManyToOne
    @JoinColumn(name = "idRaca")
    private Raca raca;
	
    @ManyToOne
    @JoinColumn(name = "idTipoDeficiencia")
    private TipoDeficiencia tipoDeficiencia;
	
    @ManyToOne
    @JoinColumn(name = "idGrauInstrucao")
    private GrauInstrucao grauInstrucao;
	
    @ManyToOne
    @JoinColumn(name = "idSituacaoFamiliar")
    private SituacaoFamiliar situacaoFamiliar;
   
    @ManyToOne
    @JoinColumn(name = "idRendaFamiliar")
    private RendaFamiliar rendaFamiliar;
	
    @ManyToOne
    @JoinColumn(name = "idSituacaoSocial")
    private SituacaoSocial situacaoSocial;
	
    
	public Estudantes(CadastrarDadosEstudantes dados) {
		this.nome = dados.nome();
		this.sobrenome = dados.sobrenome();
		this.cpf = dados.cpf();
		this.dataNascimento = dados.dataNascimento();
		this.email = dados.email();
		this.senha = dados.senha();
		this.telefone = dados.telefone();
		this.cep = dados.cep();
		this.bairro = dados.bairro();
		this.cidade = dados.cidade();
		this.estado = dados.estado();
		this.numeroResidencia = dados.numeroResidencia();
		this.numeroFilhos = dados.numeroFilhos();
		this.deficiencia = dados.deficiencia();
		this.computador = dados.computador();
		this.internet = dados.internet();
		this.observacao = dados.observacao();
		this.ativo = dados.ativo();
		this.dataExclusao = dados.dataExclusao();
		this.observacaoExclusao = dados.observacaoExclusao();
		this.sexo= dados.sexo();
		this.raca= dados.raca();
		this.tipoDeficiencia= dados.tipoDeficiencia();
		this.grauInstrucao= dados.grauInstrucao();
		this.situacaoFamiliar= dados.situacaoFamiliar();
		this.rendaFamiliar= dados.rendaFamiliar();
		this.situacaoSocial= dados.situacaoSocial();
	}
}
