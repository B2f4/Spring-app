package it.its.auriga.sample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.its.auriga.sample.dto.TeacherDTO;
import it.its.auriga.sample.models.Teacher;
import it.its.auriga.sample.repositories.ITeacherRepository;
import it.its.auriga.sample.services.ICardService;
import it.its.auriga.sample.services.ITeacherService;
import it.its.auriga.sample.utils.Conversions;
import jakarta.transaction.Transactional;

@Service
public class TeacherServiceImpl implements ITeacherService{
	
	@Autowired
	ITeacherRepository teacherRespository;
	
	@Autowired
	ICardService cardService;
	
	@Transactional
	@Override
	public TeacherDTO save(TeacherDTO teacherDTO) {
		Teacher newTeacher = Conversions.teacherDTOToTeacher(teacherDTO);
		newTeacher.setTeacherCard(cardService.save());
		teacherRespository.save(newTeacher);
		teacherDTO.setTeacherCard(newTeacher.getTeacherCard().getId());
		teacherDTO.setId(newTeacher.getId());
		return teacherDTO;
	}
	
	
	@Transactional
	@Override
	public List<TeacherDTO> getAll() {
		return Conversions.TeacherListToTeacherListDTO(teacherRespository.findAll());
	}
	
	
	@Transactional
	@Override
	public TeacherDTO getById(int id) {
		return Conversions.teacherToTeacherDTO(teacherRespository.getReferenceById(id));
	}
	
	
	@Transactional
	@Override
	public TeacherDTO getByName(String name) {
		return Conversions.teacherToTeacherDTO(teacherRespository.findByName(name));
	}
	
	
	@Transactional
	@Override
	public TeacherDTO deleteById(int id) {
		teacherRespository.deleteById(id);
		return new TeacherDTO();
	}

	
}
