package it.its.auriga.sample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.its.auriga.sample.dto.StudenteDTO;
import it.its.auriga.sample.models.Studente;
import it.its.auriga.sample.repositories.IStudenteRepository;
import it.its.auriga.sample.services.ICardService;
import it.its.auriga.sample.services.IStudenteService;
import it.its.auriga.sample.utils.Conversions;
import jakarta.transaction.Transactional;


@Service
public class StudenteServiceImpl implements IStudenteService{

	@Autowired
	IStudenteRepository studenteRepository;
	
	@Autowired
	ICardService cardService;
	
	@Transactional
	@Override
	public StudenteDTO save(StudenteDTO studenteDTO) {
		Studente newStudente = Conversions.studenteDTOToStudente(studenteDTO);
		newStudente.setStudentCard(cardService.save());
		studenteRepository.save(newStudente);
		studenteDTO.setStudentCard(newStudente.getStudentCard().getId());
		return studenteDTO;
	}
	
	@Transactional
	@Override
	public List<StudenteDTO> getAll() {		
		return Conversions.StudentListToStudentListDTO(studenteRepository.findAll());
		
	}
	
	
	@Transactional
	@Override
	public StudenteDTO getById(int id) {
		Studente studente = studenteRepository.getReferenceById(id);
		StudenteDTO studenteDTO = Conversions.studenteToStudenteDTO(studente);
		studenteDTO.setId(studente.getId());
		return studenteDTO;
	}
	
	
	@Transactional
	@Override
	public StudenteDTO getByName(String name) {		
		Studente studente = studenteRepository.findByName(name);
		StudenteDTO studenteDTO = Conversions.studenteToStudenteDTO(studente);
		return studenteDTO;
	}
	
	
	@Transactional
	@Override
	public StudenteDTO deleteById(int id) {
		studenteRepository.deleteById(id);
		return new StudenteDTO();
	}

	@Override
	public StudenteDTO patch(int id, StudenteDTO studentedto) {
		studenteRepository.getReferenceById(id);
		return studentedto;
	}

}
