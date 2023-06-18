package br.com.cotiinformatica.controlleres;

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

@RestController
@RequestMapping(value = "api/alunos")
public class AlunosControlller {

	@PostMapping
	public void Post(@RequestBody AlunosPostDTO dto) {
		// TODO: POST
		/*Retirar o Void ; incluir "ResponseEntity e o tipo de retorno<String>
		*Mensagens: 200: Sucesso
		*Mensagem 400: Fez a busca, mas não foi encontrado.
		*Mensagem 500: Falha no desenvolvimento
		*/
	}

	@PutMapping
	public void Put(@RequestBody AlunosPutDTO dto) {
		// TODO: PUT
	}

	@DeleteMapping("{idAluno}")
	public void Put(@PathVariable("idAluno") Integer idAluno) {
		// TODO: DELETE
	}

	@GetMapping
	public void GetAll() {
		// TODO: GETALL
	}

	@GetMapping("{idAluno}")
	public void GetFindById(@PathVariable("idAluno") Integer idAluno) {
		// TODO: GETFINDBYID
	}
}