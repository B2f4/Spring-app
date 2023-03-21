package it.its.auriga.sample.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(StudenteCorsoID.class)
public class StudenteCorso {
	
	@EmbeddedId
	@ManyToOne
	Studente studente;
	
	@EmbeddedId
	@ManyToOne
	Corso corso;
	

	public Studente getStudente() {
		return studente;
	}
	public void setStudente(Studente studente) {
		this.studente = studente;
	}
	public Corso getCorso() {
		return corso;
	}
	public void setCorso(Corso corso) {
		this.corso = corso;
	}
	
	
	
	
	
	
}


