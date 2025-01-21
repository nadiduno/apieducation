package com.edu.apiEducation.trilha;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "trilha")
@Entity(name = "Trilha")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTrilha")
public class Trilha {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTrilha;
	private String descricaoTrilha; 
	
	public Trilha(CadastrarDadosTrilha dados) {
		this.descricaoTrilha = dados.descricaoTrilha();
	}
}
