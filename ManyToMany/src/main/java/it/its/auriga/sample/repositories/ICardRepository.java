package it.its.auriga.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.its.auriga.sample.models.Card;

public interface ICardRepository extends JpaRepository<Card, Integer>{

}
