package br.com.cotiinformatica.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//MARCAÇÕES DO SPRING DATA
@Entity
@Table(name = "Professor")

//Marcações do SpringBoot- JavaBeans
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProfessor")
	private Integer idProfessor;

	@Column(name = "nomeProfessor", length = 150, nullable = false)
	private String nomeProfessor;

	@Column(name = "telefone", length = 15, nullable = false)
	private String telefone;

	@OneToMany(mappedBy = "professor")
	private List<Turma> turma;

}
