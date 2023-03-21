package it.its.auriga.sample.models;


import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudenteCorsoID implements Serializable{
	private int studente;
	private int corso;
	
	
	public StudenteCorsoID() {};

	public StudenteCorsoID(int studente, int corso) {
		this.studente = studente;
		this.corso = corso;
	}

	public int getStudente() {
		return studente;
	}

	public void setStudente(int studente) {
		this.studente = studente;
	}

	public int getCorso() {
		return corso;
	}

	public void setCorso(int corso) {
		this.corso = corso;
	}
	
}
