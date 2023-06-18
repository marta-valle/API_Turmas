package br.com.cotiinformatica.controlleres;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dto.MatriculasPostDTO;

@RestController
@RequestMapping(value = "api/matriculas")
public class MatriculasController{
	@PostMapping
	public void Post(@RequestBody MatriculasPostDTO dto) {
		// TODO: POST
	}

	@DeleteMapping("{idMatriculas}")
	public void Put(@PathVariable("idMatriculas") Integer idMatriculas) {
		// TODO: DELETE
	}

}
