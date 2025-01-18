package com.edu.apiEducation.aulas;

import java.net.URI;

public record CadastrarDadosAulas(String descricao_aula,URI link_aula, long id_curso, long id_professor, String observacao) {

}
