package br.com.cotiinformatica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//MARCAÇÕES DO SPRING DATA
@Entity
@Table(name = "Turma")

//Marcações do SpringBoot- JavaBeans
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTurma")
	private Integer idTurma;

	@Column(name = "nomeTurma", length = 150, nullable = false)
	private String nomeTurma;

	@Column(name = "dataInicio", length = 8, nullable = false)
	private String dataInicio;

	@Column(name = "dataFim", length = 8, nullable = false)
	private String dataFim;

	@ManyToOne // Muitas turmas para um professor
	@JoinColumn(name = "idprofessor", nullable = false) // retornará a coluna com o nome idprofessor ; não pode deixar
														// de ser preenchido
	private Professor professor; // Variavel tipo classe professor com valor de professor.

}
