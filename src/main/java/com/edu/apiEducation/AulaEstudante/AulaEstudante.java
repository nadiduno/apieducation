package com.edu.apiEducation.AulaEstudante;

import com.edu.apiEducation.aulas.Aulas;
import com.edu.apiEducation.estudantes.Estudantes;

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

@Table(name = "aulaEstudante")
@Entity(name = "AulaEstudante")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idAulaEstudante")
public class AulaEstudante {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAulaProfessor;
	
	@ManyToOne
    @JoinColumn(name = "idAula")
    private Aulas aula;
	
	@ManyToOne
    @JoinColumn(name = "idEstudante")
    private Estudantes estudante;

    
	public AulaEstudante(CadastrarDadosAulaEstudante dados) {
		this.aula = dados.aula();
		this.estudante= dados.estudante();
	}
}
