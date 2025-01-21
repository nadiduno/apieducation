package com.edu.apiEducation.nivelExperiencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "nivelExperiencia")
@Entity(name = "NivelExperiencia")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idNivelExperiencia")
public class NivelExperiencia {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNivelExperiencia;
	private String descricaoNivelExperiencia; 
	
	public NivelExperiencia(CadastrarDadosNivelExperiencia dados) {
		this.descricaoNivelExperiencia = dados.descricaoNivelExperiencia();
	}
}
