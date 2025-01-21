package com.edu.apiEducation.rendaFamiliar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "rendaFamiliar")
@Entity(name = "RendaFamiliar")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idRendaFamiliar")
public class RendaFamiliar {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRendaFamiliar;
	private String descricaoRendaFamiliar; 
	
	public RendaFamiliar(CadastrarDadosRendaFamiliar dados) {
		this.descricaoRendaFamiliar = dados.descricaoRendaFamiliar();
	}
}
