package com.fingerpaint.cardcollector.dao.hibernate;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

import com.fingerpaint.cardcollector.dao.CardDao;
import com.fingerpaint.cardcollector.model.Card;

@Repository("cardDao")
public class CardDaoHibernate extends GenericDaoHibernate<Card, Long> implements
		CardDao {

	public CardDaoHibernate() {
		super(Card.class);
	}
	
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Card> findByNamedQuery(String arg0, Map<String, Object> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Card get(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Card> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Card> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Long arg0) {
		// TODO Auto-generated method stub

	}

	public Card save(Card arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Card> findByLastName(String lName) {
		// TODO Auto-generated method stub
		return null;
	}

}
