package com.fingerpaint.cardcollector.service.impl;

import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;

import com.fingerpaint.cardcollector.dao.CardDao;
import com.fingerpaint.cardcollector.model.Card;
import com.fingerpaint.cardcollector.service.CardManager;

public class CardManagerImpl extends GenericManagerImpl<Card, Long> implements
		CardManager {

	CardDao cardDao;
	
	@Autowired
	public CardManagerImpl(CardDao cardDao) {
		super(cardDao);
		this.cardDao = cardDao;
	}
	
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Card get(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Card> getAll() {
		// Generate list 
		return cardDao.getAll();
	}

	public void remove(Long arg0) {
		// TODO Auto-generated method stub

	}

	public Card save(Card arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Card> search(String arg0, Class arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Card> findByLastName(String lName) {
		// TODO Auto-generated method stub
		return (List)cardDao.findByLastName(lName);
	}

}
