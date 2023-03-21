package it.its.auriga.sample.services;

import java.util.List;

import it.its.auriga.sample.dto.CorsoDTO;

public interface ICorsoService {

	public CorsoDTO save(CorsoDTO corsoDTO);
	
	public List<CorsoDTO> getAll();
	
	public CorsoDTO getById(int id);
	
	public List<CorsoDTO> getByName(String name);
	
	public CorsoDTO deleteById(int id);
	
}
