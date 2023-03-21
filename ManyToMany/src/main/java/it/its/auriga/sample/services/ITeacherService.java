package it.its.auriga.sample.services;

import java.util.List;

import it.its.auriga.sample.dto.TeacherDTO;

public interface ITeacherService {

	public TeacherDTO save(TeacherDTO teacher);
	
	public List<TeacherDTO> getAll();
	
	public TeacherDTO getById(int id);
	
	public TeacherDTO getByName(String name);
	
	public TeacherDTO deleteById(int id);
	
}
