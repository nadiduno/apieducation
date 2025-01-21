package com.edu.apiEducation.raca;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "raca")
@Entity(name = "Raca")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idRaca")
public class Raca {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRaca;
	private String descricaoRaca; 
	
	public Raca(CadastrarDadosRaca dados) {
		this.descricaoRaca = dados.descricaoRaca();
	}
}
