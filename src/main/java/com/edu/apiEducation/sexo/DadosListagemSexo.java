package com.edu.apiEducation.sexo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record DadosListagemSexo(Sexo sexo) {
	
	 @JsonIgnore
	    public String getDescricaoSexo() {
	        return sexo.getDescricaoSexo();
	    }

}