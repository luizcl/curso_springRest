package com.algaworks.osworks.domain.model;

import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
	
	private long id;
	private String nome;
	private String email;
	private String telefone;
	

}
