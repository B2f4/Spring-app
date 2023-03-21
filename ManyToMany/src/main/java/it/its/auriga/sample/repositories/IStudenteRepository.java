package it.its.auriga.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.its.auriga.sample.models.Studente;

public interface IStudenteRepository extends JpaRepository<Studente, Integer>{
	
	public Studente findByName(String name);

}

