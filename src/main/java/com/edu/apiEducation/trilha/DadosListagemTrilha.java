package com.edu.apiEducation.trilha;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record DadosListagemTrilha(Trilha trilha) {
	
	 @JsonIgnore
	    public String getDescricaoTrilha() {
	        return trilha.getDescricaoTrilha();
	    }

}