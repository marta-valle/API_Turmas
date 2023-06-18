package br.com.cotiinformatica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//MARCAÇÕES DO SPRINGDATA - BANCO DE DADOS
@Entity
@Table(name ="Aluno")

//Annotacão do SpringBoot - Padrão JavaBeans
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //CONFIRMAR SE ESTA CERTO O NOME
	@Column(name="idAluno")
	private Integer idAluno;
	
	@Column(name="nomeAluno", length= 150, nullable = false)
	private String nomeAluno;
	
	@Column(name="matricula", length = 150,  nullable = false) //ACHO QUE É UMA CHAVE ESTRANGEIRA
	private String matricula;
	
	@Column(name="cpf", length= 150, nullable = false)
	private String cpf;
}
