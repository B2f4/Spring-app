package it.its.auriga.sample.dto;

import java.util.List;

import it.its.auriga.sample.models.Studente;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CorsoDTO {

	
	int id;
	
	@NotNull
	@NotEmpty
	String name;
	
	@NotNull
	@NotEmpty
	String subject;
	
	@NotNull
	@NotEmpty
	String classroom;
	
	@NotNull
	@NotEmpty
	String teacher;
	
	
	List<Studente> studenti;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getClassroom() {
		return classroom;
	}


	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	public List<Studente> getStudenti() {
		return studenti;
	}


	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}
	
	
}
