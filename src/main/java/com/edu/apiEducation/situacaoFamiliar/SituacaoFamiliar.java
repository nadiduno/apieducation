package com.edu.apiEducation.situacaoFamiliar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "situacaoFamiliar")
@Entity(name = "SituacaoFamiliar")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idSituacaoFamiliar")
public class SituacaoFamiliar {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSituacaoFamiliar;
	private String descricaoSituacaoFamiliar; 
	
	public SituacaoFamiliar(CadastrarDadosSituacaoFamiliar dados) {
		this.descricaoSituacaoFamiliar = dados.descricaoSituacaoFamiliar();
	}
}
