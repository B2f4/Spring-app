package it.its.auriga.sample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.its.auriga.sample.dto.CorsoDTO;
import it.its.auriga.sample.services.ICorsoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/api/corso")
public class CorsoController {
	
	@Autowired
	ICorsoService corsoService;
	
	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public CorsoDTO save(@RequestBody @Valid CorsoDTO corsoDTO) {
		return corsoService.save(corsoDTO);
	}
	
	@GetMapping(value = "getById/{id}")
	public CorsoDTO getById(@PathVariable("id") int id) {
	return corsoService.getById(id);
	}
	
	@GetMapping(value = "getByName/{name}")
	public List<CorsoDTO> getByName(@PathVariable("name") String name) {
		return corsoService.getByName(name);
	}
	
	@DeleteMapping(value = "deleteById/{id}")
	public CorsoDTO deleteById(@PathVariable("id") int id) {
		return corsoService.deleteById(id);
	}
	
	@GetMapping(value = "/getAll")
	public List<CorsoDTO> getAll() {
		return corsoService.getAll();
	}
}
