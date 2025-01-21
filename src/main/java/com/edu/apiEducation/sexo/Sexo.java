package com.edu.apiEducation.sexo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "sexo")
@Entity(name = "Sexo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idSexo")
public class Sexo {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSexo;
	private String descricaoSexo; 
	
	public Sexo(CadastrarDadosSexo dados) {
		this.descricaoSexo = dados.descricaoSexo();
	}
	
	public Sexo() {}
	
	public String getDescricaoSexo() {
		return descricaoSexo;
	}
	
}
