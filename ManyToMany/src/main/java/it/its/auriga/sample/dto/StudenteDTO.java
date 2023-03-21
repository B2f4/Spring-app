package it.its.auriga.sample.dto;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public class StudenteDTO {
	
	
	int id;
	@NotNull
	@NotEmpty
	String name;
	
	@NotNull
	@NotEmpty
	String lastName;
	

	LocalDate birthDay;
	
	int studentCard;
	
	
	List<CorsoDTO> corsi;


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


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}


	public int getStudentCard() {
		return studentCard;
	}


	public void setStudentCard(int studentCard) {
		this.studentCard = studentCard;
	}


	public List<CorsoDTO> getCorsi() {
		return corsi;
	}


	public void setCorsi(List<CorsoDTO> corsi) {
		this.corsi = corsi;
	}
	
	
	
	
	
}
