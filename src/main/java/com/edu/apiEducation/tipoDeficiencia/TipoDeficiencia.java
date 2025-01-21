package com.edu.apiEducation.tipoDeficiencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tipoDeficiencia")
@Entity(name = "TipoDeficiencia")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTipoDeficiencia")
public class TipoDeficiencia {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTipoDeficiencia;
	private String descricaoTipoDeficiencia; 
	
	public TipoDeficiencia(CadastrarDadosTipoDeficiencia dados) {
		this.descricaoTipoDeficiencia = dados.descricaoTipoDeficiencia();
	}
}
