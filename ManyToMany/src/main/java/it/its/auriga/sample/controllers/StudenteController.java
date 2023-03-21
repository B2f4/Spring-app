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

import it.its.auriga.sample.dto.StudenteCorsoDTO;
import it.its.auriga.sample.dto.StudenteDTO;
import it.its.auriga.sample.services.IStudenteCorsoService;
import it.its.auriga.sample.services.IStudenteService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/api/studente")
public class StudenteController {
	
	@Autowired
	IStudenteService studenteService;
	
	@Autowired
	IStudenteCorsoService stuCorsoService;
	
	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public StudenteDTO save(@RequestBody @Valid StudenteDTO studenteDTO) {
		return studenteService.save(studenteDTO);
	}
	
	@PostMapping(value = "/saveStudenteCorso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public StudenteCorsoDTO save(@RequestBody @Valid StudenteCorsoDTO studenteCorsoDTO) {
		return stuCorsoService.save(studenteCorsoDTO);
	}
	
	@GetMapping(value = "/getById/{id}")
	public StudenteDTO getById(@PathVariable("id") int id) {
	return studenteService.getById(id);
	}
	
	@GetMapping(value = "/getByName/{name}")
	public StudenteDTO getByName(@PathVariable("name") String name) {
		return studenteService.getByName(name);
	}
	
	@DeleteMapping(value = "/deleteById/{id}")
	public StudenteDTO deleteById(@PathVariable("id") int id) {
		return studenteService.deleteById(id);
	}
	
	@GetMapping(value = "/getAll")
	public List<StudenteDTO> getAll() {
		return studenteService.getAll();
	}
	
	
	
}
