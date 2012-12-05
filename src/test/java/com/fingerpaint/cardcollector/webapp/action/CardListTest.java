package com.fingerpaint.cardcollector.webapp.action;

import org.appfuse.service.GenericManager;
import com.fingerpaint.cardcollector.model.Card;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 
import static org.junit.Assert.*;

public class CardListTest extends BasePageTestCase {
	
	private CardList bean;
	@Autowired @Qualifier("cardManager")
	private GenericManager<Card, Long> cardManager;
	
	@Override
	@Before
	@SuppressWarnings("unchecked")
	public void onSetUp()
	{
		super.onSetUp();
		bean = new CardList();
		bean.setCardManager(cardManager);
		
		Card card = new Card();
		card.setfName("Billy Joe");
		card.setlName("Robideux");
		card.setTitle("OF");
		
		
	}
	
	@Override
	@After
	public void onTearDown() {
		super.onTearDown();
		bean = null;
		
	}
	
	@Test
	public void testSearch() throws Exception {
		assertTrue(bean.getCards().size() >= 1);
		assertFalse(bean.hasErrors());
		
	}

}
