package it.its.auriga.sample.utils;

import java.util.ArrayList;
import java.util.List;


import it.its.auriga.sample.dto.CardDTO;
import it.its.auriga.sample.dto.CorsoDTO;
import it.its.auriga.sample.dto.StudenteDTO;
import it.its.auriga.sample.dto.TeacherDTO;
import it.its.auriga.sample.models.Card;
import it.its.auriga.sample.models.Corso;
import it.its.auriga.sample.models.Studente;
import it.its.auriga.sample.models.Teacher;

public class Conversions {
	
	
	public static TeacherDTO teacherToTeacherDTO(Teacher teacher) {
		TeacherDTO teacherDTO = new TeacherDTO();
		
		teacherDTO.setName(teacher.getName());
		teacherDTO.setLastName(teacher.getLastName());
		teacherDTO.setTeacherCard(teacher.getTeacherCard().getId());
		teacherDTO.setId(teacher.getId());

		return teacherDTO;
	}
	
	
	public static Teacher teacherDTOToTeacher(TeacherDTO teacherDTO) {
		Teacher teacher = new Teacher();
		
		teacher.setName(teacherDTO.getName());
		teacher.setLastName(teacherDTO.getLastName());
		teacher.setTeacherCard(teacher.getTeacherCard());
		teacher.setId(teacherDTO.getId());
		
		
		return teacher;
	}
	
	public static List<TeacherDTO> TeacherListToTeacherListDTO(List<Teacher> teacherList){
		List<TeacherDTO> teacherListDTO = new ArrayList<>();
		for (Teacher teacher : teacherList) {
			teacherListDTO.add(teacherToTeacherDTO(teacher));
			
			}
		return teacherListDTO;
	}
	
	public static StudenteDTO studenteToStudenteDTO(Studente studente) {
		StudenteDTO studenteDTO = new StudenteDTO();
		
		studenteDTO.setName(studente.getName());
		studenteDTO.setLastName(studente.getLastName());
		studenteDTO.setBirthDay(studente.getBirthDay());
		studenteDTO.setStudentCard(studente.getStudentCard().getId());
		studenteDTO.setId(studente.getId());
		
		return studenteDTO;
	}
	
	
	public static Studente studenteDTOToStudente(StudenteDTO studenteDTO) {
		Studente studente = new Studente();
		
		studente.setName(studenteDTO.getName());
		studente.setLastName(studenteDTO.getLastName());
		studente.setBirthDay(studenteDTO.getBirthDay());
		
		return studente;
	}
	
	public static List<StudenteDTO> StudentListToStudentListDTO(List<Studente> studentList){
		List<StudenteDTO> studentListDTO = new ArrayList<>();
		for (Studente studente : studentList) {
			studentListDTO.add(studenteToStudenteDTO(studente));
			}
		return studentListDTO;
	}
	
	
	public static CorsoDTO corsoTocorsoDTO(Corso corso) {
		CorsoDTO corsoDTO = new CorsoDTO();
		corsoDTO.setName(corso.getName());
		corsoDTO.setSubject(corso.getSubject());
		corsoDTO.setClassroom(corso.getClassroom());
		corsoDTO.setId(corso.getId());
		return corsoDTO;
	}
	
	public static Corso corsoDTOTocorso(CorsoDTO corsoDTO) {
		Corso corso = new Corso();
		
		corso.setName(corsoDTO.getName());
		corso.setSubject(corsoDTO.getSubject());
		corso.setClassroom(corsoDTO.getClassroom());
		
		
		return corso;
	}
	
	public static List<CorsoDTO> CorsoListToCorsoDTO(List<Corso> corsoList){
		List<CorsoDTO> corsoListDTO = new ArrayList<>();
		for (Corso corso : corsoList) {
			corsoListDTO.add(corsoTocorsoDTO(corso));
			}
		return corsoListDTO;
	}
	

	public static CardDTO cardToCardDTO(Card card) {
		
		CardDTO cardDTO = new CardDTO();
		cardDTO.setId(card.getId());
		cardDTO.setCode(card.getCode());
		
		return cardDTO;
	}
	
	public static Card cardDTOtoCard(CardDTO cardDTO) {
		
		Card card = new Card();
		card.setId(cardDTO.getId());
		card.setCode(cardDTO.getCode());
		
		return card;
	}
	
	
	public static List<CardDTO> ListCardDTOtoCardList(List<Card> cardList){
		List<CardDTO> cardListDTO = new ArrayList<>();
		for(Card card : cardList) {
			cardListDTO.add(cardToCardDTO(card));
		}
		return cardListDTO;
	}
	
	
	
}
