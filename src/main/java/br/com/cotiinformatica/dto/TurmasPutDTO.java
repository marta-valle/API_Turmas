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
public class TurmasPutDTO {
	
	private Integer idTurma;
	private String nomeTurma;
	private String dataInicio;
	private String dataFim;
	private Integer idProfessor;

}
