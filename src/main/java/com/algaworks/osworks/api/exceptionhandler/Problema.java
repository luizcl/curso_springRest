package com.algaworks.osworks.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Problema {

	private int status;
	private LocalDateTime dataHora;
	private String titulo;
	private List<Campo> campos;
	
	@Data
	@AllArgsConstructor
	public static class Campo{
		private String nome;
		private String mensagem;
	}
	
}
