package com.edu.apiEducation.situacaoSocial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "situacaoSocial")
@Entity(name = "SituacaoSocial")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idSituacaoSocial")
public class SituacaoSocial {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSituacaoSocial;
	private String descricaoSituacaoSocial; 
	
	public SituacaoSocial(CadastrarDadosSituacaoSocial dados) {
		this.descricaoSituacaoSocial = dados.descricaoSituacaoSocial();
	}
}
