package it.its.auriga.sample.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String code;
	
	@OneToOne(mappedBy = "studentCard", targetEntity = Studente.class)
	Studente studenteId;
	
	@OneToOne(mappedBy = "teacherCard", targetEntity = Teacher.class)
	Teacher teacherId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Studente getStudenteId() {
		return studenteId;
	}

	public void setStudenteId(Studente studenteId) {
		this.studenteId = studenteId;
	}

	public Teacher getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Teacher teacherId) {
		this.teacherId = teacherId;
	}



	
	

	
	

}
