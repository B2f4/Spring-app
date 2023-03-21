package it.its.auriga.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.its.auriga.sample.models.Teacher;

public interface ITeacherRepository extends JpaRepository<Teacher, Integer>{

	public Teacher findByName(String name);
	
}
