package br.com.cotiinformatica.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class AlunosPutDTO {
	private Integer idAluno;
	private String nomeAluno;
	private String matricula;
	private String cpf;
	
}
