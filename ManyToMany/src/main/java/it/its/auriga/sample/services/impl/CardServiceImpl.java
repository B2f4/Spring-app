package it.its.auriga.sample.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.its.auriga.sample.models.Card;
import it.its.auriga.sample.repositories.ICardRepository;
import it.its.auriga.sample.services.ICardService;
import jakarta.transaction.Transactional;

@Service
public class CardServiceImpl implements ICardService{

	@Autowired
	ICardRepository cardRepository;
	
	@Transactional
	@Override
	public Card save() {
		Card newCard = new Card();
		newCard.setCode(UUID.randomUUID().toString());
		cardRepository.save(newCard);
		return newCard;
	}
	
	@Transactional
	@Override
	public Card getById(int id) {
		Card getCard = cardRepository.getReferenceById(id);
		return getCard;
	}
	
	@Transactional
	@Override
	public List<Card> getAll() {
		List<Card> cardList = cardRepository.findAll();
		return cardList;
	}
	
	@Transactional
	@Override
	public Card deleteById(int id) {
		cardRepository.deleteById(id);
		return new Card();
	}

	
	
}
