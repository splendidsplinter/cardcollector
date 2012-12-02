package com.fingerpaint.cardcollector.dao;

import java.util.Collection;

import org.appfuse.dao.GenericDao;

import com.fingerpaint.cardcollector.model.Card;

public interface CardDao extends GenericDao<Card, Long> {
	
	public Collection<Card> findByLastName(String lName);

}
