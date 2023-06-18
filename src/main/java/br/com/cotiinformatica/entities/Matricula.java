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
@Table(name = "Matricula")

//Marcações do SpringBoot- JavaBeans
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer idMatricula;

	@Column(name = "dataMatriula", length = 8, nullable = false)
	private String dataMatricula;

	@ManyToOne
	@JoinColumn(name = "idTurma", nullable = false)
	private Turma turma;

	@ManyToOne
	@JoinColumn(name = "idAluno", nullable = false)
	private Aluno aluno;

}
