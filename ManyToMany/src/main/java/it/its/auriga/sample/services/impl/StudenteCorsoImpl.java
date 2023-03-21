package it.its.auriga.sample.services.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.its.auriga.sample.dto.StudenteCorsoDTO;
import it.its.auriga.sample.models.StudenteCorso;
import it.its.auriga.sample.repositories.ICorsoRepository;
import it.its.auriga.sample.repositories.IStudenteCorsoRepository;
import it.its.auriga.sample.repositories.IStudenteRepository;
import it.its.auriga.sample.services.IStudenteCorsoService;

@Service
public class StudenteCorsoImpl implements IStudenteCorsoService{
	
	@Autowired
	IStudenteCorsoRepository stuCorsoRepository;
	
	@Autowired
	IStudenteRepository studenteRepository;
	
	@Autowired
	ICorsoRepository corsoRepository;
	
	@Override
	public StudenteCorsoDTO save(StudenteCorsoDTO studenteCorsoDTO) {
		StudenteCorso studenteCorso = new StudenteCorso();
		studenteCorso.setCorso(corsoRepository.getReferenceById(studenteCorsoDTO.getCorso()));
		studenteCorso.setStudente(studenteRepository.getReferenceById(studenteCorsoDTO.getStudente()));
		stuCorsoRepository.save(studenteCorso);
		
		return studenteCorsoDTO;
	}

}
