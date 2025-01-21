package com.edu.apiEducation.aulaProfessor;

import com.edu.apiEducation.aulas.Aulas;
import com.edu.apiEducation.professores.Professores;

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

@Table(name = "aulaProfessor")
@Entity(name = "AulaProfessor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idAulaProfessor")
public class AulaProfessor {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAulaProfessor;
	
	@ManyToOne
    @JoinColumn(name = "idAula")
    private Aulas aula;
	
	@ManyToOne
    @JoinColumn(name = "idProfessor")
    private Professores professor;

    
	public AulaProfessor(CadastrarDadosAulaProfessor dados) {
		this.aula = dados.aula();
		this.professor= dados.professor();
	}
}
