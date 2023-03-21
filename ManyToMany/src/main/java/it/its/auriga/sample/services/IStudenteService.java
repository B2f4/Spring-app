package it.its.auriga.sample.services;

import java.util.List;

import it.its.auriga.sample.dto.StudenteDTO;

public interface IStudenteService {

	public StudenteDTO save(StudenteDTO studente);
	
	public StudenteDTO patch(int id, StudenteDTO studenteDTO);
	
	public List<StudenteDTO> getAll();
	
	public StudenteDTO getById(int id);
	
	public StudenteDTO getByName(String name);
	
	public StudenteDTO deleteById(int id);
	
}
