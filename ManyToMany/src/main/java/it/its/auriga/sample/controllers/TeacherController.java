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

import it.its.auriga.sample.dto.TeacherDTO;
import it.its.auriga.sample.services.ICardService;
import it.its.auriga.sample.services.ITeacherService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("v1/api/teacher")
public class TeacherController {
	
	@Autowired
	ITeacherService teacherService;
	
	ICardService cardService;
	
	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public TeacherDTO save(@RequestBody @Valid TeacherDTO teacherDTO) {
		return teacherService.save(teacherDTO);
	}
	
	@GetMapping(value = "getById/{id}")
	public TeacherDTO getById(@PathVariable("id") int id) {
	return teacherService.getById(id);
	}
	
	@GetMapping(value = "getByName/{name}")
	public TeacherDTO getByName(@PathVariable("name") String name) {
		return teacherService.getByName(name);
	}
	
	@DeleteMapping(value = "deleteById/{id}")
	public TeacherDTO deleteById(@PathVariable("id") int id) {
		return teacherService.deleteById(id);
	}
	
	@GetMapping(value = "/getAll")
	public List<TeacherDTO> getAll() {
		return teacherService.getAll();
	}
	
}
