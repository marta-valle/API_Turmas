package br.com.cotiinformatica.controlleres;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dto.TurmasPostDTO;
import br.com.cotiinformatica.dto.TurmasPutDTO;

@RestController
@RequestMapping(value = "api/turmas")
public class TurmasController {
	@PostMapping
	public void Post(@RequestBody TurmasPostDTO dto) {
		// TODO: POST
	}

	@PutMapping
	public void Put(@RequestBody TurmasPutDTO dto) {
		// TODO: PUT
	}

	@DeleteMapping("{idTurmas}")
	public void Put(@PathVariable("idTurmas") Integer idTurmas) {
		// TODO: DELETE
	}

	@GetMapping
	public void GetAll() {
		// TODO: GETALL
	}

	@GetMapping("{idTurmas}")
	public void GetFindById(@PathVariable("idTurmas") Integer idTurmas) {
		// TODO: GETFINDBYID
	}
}