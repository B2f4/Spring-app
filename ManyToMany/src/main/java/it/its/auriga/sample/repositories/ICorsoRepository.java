package it.its.auriga.sample.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.its.auriga.sample.models.Corso;

public interface ICorsoRepository extends JpaRepository<Corso, Integer>{
	
	public List<Corso> findByName(String name);
	
}
