package it.its.auriga.sample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.its.auriga.sample.dto.CorsoDTO;
import it.its.auriga.sample.models.Corso;
import it.its.auriga.sample.models.Teacher;
import it.its.auriga.sample.repositories.ICorsoRepository;
import it.its.auriga.sample.repositories.ITeacherRepository;
import it.its.auriga.sample.services.ICorsoService;
import it.its.auriga.sample.utils.Conversions;
import jakarta.transaction.Transactional;

@Service
public class CorsoServiceImpl implements ICorsoService{

	@Autowired
	ICorsoRepository corsoRepository;
	
	@Autowired
	ITeacherRepository teacherRepository;
	
	@Transactional
	@Override
	public CorsoDTO save(CorsoDTO corsoDTO) {
		Corso corso = Conversions.corsoDTOTocorso(corsoDTO);
		Teacher teacher = teacherRepository.findByName(corsoDTO.getTeacher());
		corso.setTeacher(teacher);
		corsoDTO.setId(corso.getId());
		corsoRepository.save(corso);
		return corsoDTO;
	}
	
	@Transactional
	@Override
	public List<CorsoDTO> getAll() {
		return Conversions.CorsoListToCorsoDTO(corsoRepository.findAll());
	}
	
	@Transactional
	@Override
	public CorsoDTO getById(int id) {
		return Conversions.corsoTocorsoDTO(corsoRepository.getReferenceById(id));
	}
	
	@Transactional
	@Override
	public List<CorsoDTO> getByName(String name) {
		return Conversions.CorsoListToCorsoDTO(corsoRepository.findByName(name));
	}
	
	
	@Transactional
	@Override
	public CorsoDTO deleteById(int id) {
		corsoRepository.deleteById(id);
		return new CorsoDTO();
	}
	
	

	
	
}
