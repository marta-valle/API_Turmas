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

public class MatriculasPostDTO {
	private Integer idTurma;
	private Integer idAluno;
	private String dataMatricula;

}
