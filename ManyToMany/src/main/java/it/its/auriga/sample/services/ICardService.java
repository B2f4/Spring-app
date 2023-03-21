package it.its.auriga.sample.services;

import java.util.List;

import it.its.auriga.sample.models.Card;

public interface ICardService {

	public Card save();
	
	public Card getById(int id);
	
	public List<Card> getAll();
	
	public Card deleteById(int id);
	
}
