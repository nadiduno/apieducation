package com.edu.apiEducation.aulaProfessor;

import com.edu.apiEducation.aulas.Aulas;
import com.edu.apiEducation.professores.Professores;

public record CadastrarDadosAulaProfessor(
		Aulas aula,
		Professores professor
		) {
}
