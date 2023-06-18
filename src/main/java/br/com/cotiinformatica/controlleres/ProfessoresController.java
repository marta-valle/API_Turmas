package br.com.cotiinformatica.controlleres;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dto.ProfessorPostDTO;
import br.com.cotiinformatica.dto.ProfessorPutDTO;


@RestController
@RequestMapping(value = "api/profesores")
public class ProfessoresController {
	@PostMapping
	public void Post(@RequestBody ProfessorPostDTO dto) {
		// TODO: POST
	}

	@PutMapping
	public void Put(@RequestBody ProfessorPutDTO dto) {
		// TODO: PUT
	}

	@DeleteMapping("{idProfessor}")
	public void Put(@PathVariable("idProfessor") Integer idProfessor) {
		// TODO: DELETE
	}

	@GetMapping
	public void GetAll() {
		// TODO: GETALL
	}

	@GetMapping("{idProfessor}")
	public void GetFindById(@PathVariable("idProfessor") Integer idProfessor) {
		// TODO: GETFINDBYID   ---- 
	}
}