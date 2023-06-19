package br.com.cotiinformatica.controlleres;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dto.AlunosPostDTO;
import br.com.cotiinformatica.dto.AlunosPutDTO;
import br.com.cotiinformatica.entities.Aluno;
import br.com.cotiinformatica.repositories.IAlunoRepository;

//2º fase: Implementações de métodos
@RestController
@RequestMapping(value = "api/alunos")
public class AlunosControlller {

	@Autowired
	private IAlunoRepository iAlunoRepository;

	@PostMapping
	public ResponseEntity<String> Post(@RequestBody AlunosPostDTO dto) {
		try {
			// INICIANDO ALUNO
			Aluno aluno = new Aluno();

			// RECEBENDO INFORMAÇÕES DO DTO - COMO É CADASTRO NOVO NÃO PRECISA DE ID
			aluno.setNomeAluno(dto.getNomeAluno());
			aluno.setCpf(dto.getCpf());
			aluno.setMatricula(dto.getMatricula());

			// GRAVANDO O QUE RECEBEMOS DO DTO SALVANDO NA TABELA ALUNO
			iAlunoRepository.save(aluno);

			// RETORNANDO MENSAGEM
			return ResponseEntity.status(201).body("Cadastro de Aluno realizado com sucesso!");
		} catch (Exception e) {
			// CASO DE FALHA EM DESENVOLVIMENTO.
			return ResponseEntity.status(500).body("Erro:" + e.getMessage());
		}

	}

	@PutMapping
	public ResponseEntity<String> Put(@RequestBody AlunosPutDTO dto) {
		try {
			// INICIANDO TABELA ALUNO
			Aluno aluno = new Aluno();

			// PRECISAMOS CONSULTAR SE O ALUNO QUE QUEREMOS ALTERAR, JÁ TEMOS NO BD
			// Método Optional do SpringData, executa o método do ialunorepository, buscando
			// o valor recebido pelo dto (idAluno)
			Optional<Aluno> optional = iAlunoRepository.findById(dto.getIdAluno());

			// OPTIONAL DEVERA SER "QUESTIONADO" SE O ALUNO FOI ENCONTRADO
			// OPTIONAL O ALUNO COM IDxxx FOI ENCONTRADO? SE SIM, EXECUTE:
			if (optional.isPresent()) {
				//LEMBRAR DE INCLUIR O ID QUE SERÁ ALTERADO
				aluno.setIdAluno(dto.getIdAluno());
				aluno.setNomeAluno(dto.getNomeAluno());
				aluno.setCpf(dto.getCpf());
				aluno.setMatricula(dto.getMatricula());
				
				//SALVANDO AS ALTERAÇÕES
				iAlunoRepository.save(aluno);

				return ResponseEntity.status(201).body("Alteração realizada sucesso");
			}
			// SE NÃO EXECUTE:
			else {
				return ResponseEntity.status(404).body("Aluno não encontrado, para realizar alteração");
			}

		} catch (Exception e) {
			return ResponseEntity.status(500).body("Erro:" + e.getMessage());
		}
	}

	@DeleteMapping("{idAluno}")
	public ResponseEntity<String> delete(@PathVariable("idAluno") Integer idAluno) {
		// INICIANDO TABELA ALUNO
		
		try {
			// PRECISAMOS CONSULTAR SE O ALUNO QUE QUEREMOS DELERAR, REALMENTE EXISTE
			Optional<Aluno> optional = iAlunoRepository.findById(idAluno);

			if (optional.isPresent()) {
				Aluno aluno = optional.get();
				iAlunoRepository.delete(aluno);

				return ResponseEntity.status(201).body("Exclusão do aluno realizada sucesso");
			} else {

				return ResponseEntity.status(404).body("Aluno não encontrado, por favor verifique o IdAluno");
			}

		} catch (Exception e) {
			return ResponseEntity.status(500).body("Erro:" + e.getMessage());
		}

	}

	@GetMapping
	public ResponseEntity<List<Aluno>> getAll() {
		// O RETORNO SERÁ EM LISTA
		try {

			// Criamos uma LIST para retornar os dados capturados pelo iAlunosRepository
			// (Método já criado pelo SpringData)

			List<Aluno> aluno = iAlunoRepository.findAll();

			return ResponseEntity.status(200).body(aluno);

		} catch (Exception e) {
			return ResponseEntity.status(500).body(null);
			// COMO O TIPO DE RETORNO É LISTA, SE NÃO HOUVER CADASTRO O RETORNO É NULL
		}

	}

	@GetMapping("{idAluno}")
	public ResponseEntity<Aluno> GetFindById(@PathVariable("idAluno") Integer idAluno) {
		try {

			Optional<Aluno> optional = iAlunoRepository.findById(idAluno);
			if (optional.isPresent()) {
				Aluno aluno = optional.get();

				return ResponseEntity.status(200).body(aluno);

			} else {
				return ResponseEntity.status(404).body(null);
			}

		} catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}

	}
}