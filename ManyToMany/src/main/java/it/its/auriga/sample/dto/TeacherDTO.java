package it.its.auriga.sample.dto;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public class TeacherDTO {
	
	int id;
	
	@NotNull
	@NotEmpty
	String name;
	
	@NotNull
	@NotEmpty
	String lastName;
	

	int teacherCard;
	
	
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
	public List<CorsoDTO> getCorsi() {
		return corsi;
	}
	public void setCorsi(List<CorsoDTO> corsi) {
		this.corsi = corsi;
	}
	public int getTeacherCard() {
		return teacherCard;
	}
	public void setTeacherCard(int teacherCard) {
		this.teacherCard = teacherCard;
	}
	
	

}
