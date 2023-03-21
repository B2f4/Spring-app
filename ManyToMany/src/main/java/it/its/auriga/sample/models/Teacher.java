package it.its.auriga.sample.models;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String lastName;
	
	@OneToOne
	Card teacherCard;
	
	@OneToMany(mappedBy = "teacher", targetEntity = Corso.class)
	List<Corso> corso;
	
	
	

	public List<Corso> getCorso() {
		return corso;
	}

	public void setCorso(List<Corso> corso) {
		this.corso = corso;
	}

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

	public Card getTeacherCard() {
		return teacherCard;
	}

	public void setTeacherCard(Card teacherCard) {
		this.teacherCard = teacherCard;
	}
	
	
	
	
	
}
