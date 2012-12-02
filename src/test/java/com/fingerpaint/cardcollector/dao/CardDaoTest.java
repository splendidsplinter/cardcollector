package com.fingerpaint.cardcollector.dao;

import static org.junit.Assert.*;

import java.util.Collection;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.annotation.ExpectedException;

import com.fingerpaint.cardcollector.model.Card;

public class CardDaoTest extends BaseDaoTestCase {
	@Autowired
	private CardDao cardDao;
	
	@Test
	public void testFindCardByLastName() throws Exception {
		Collection<Card> cards = cardDao.findByLastName("Bonds");
		assertTrue(cards.size() > 0);
	}
	
	@Test
	@ExpectedException(DataAccessException.class)
	public void testCreateAndRemoveCard() throws Exception {
		Card card = new Card();
		card.setfName("Bill");
		card.setlName("Schulz");
		card.setTitle("P");
		
		card = cardDao.save(card);
		flush();
		
		card = cardDao.get(card.getId());
		
		assertEquals("Bill", card.getfName());
		assertEquals("Schulz", card.getlName());
		
		cardDao.remove(card.getId());
		flush();
		
		//this should throw DataAccessException
		cardDao.get(card.getId());
	}

}
