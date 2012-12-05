package com.fingerpaint.cardcollector.service.impl;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import com.fingerpaint.cardcollector.dao.CardDao;
import com.fingerpaint.cardcollector.model.Card;
import com.fingerpaint.cardcollector.service.impl.CardManagerImpl;
import org.jmock.Expectations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Service;
 
import java.util.ArrayList;
import java.util.List;
 
import static org.junit.Assert.*;

@Service("cardManager")
public class CardManagerImplTest extends BaseManagerMockTestCase {
	 private CardManagerImpl manager = null;
	 private CardDao dao = null;
	 
	@Before
    public void setUp() {
        dao = context.mock(CardDao.class);
        manager = new CardManagerImpl(dao);
    }
	
	@After
	public void tearDown() {
		manager=null;
	}
	
	@Test
	public void testGetCard() {
		log.debug("testing get Card ...");
		
		final Long id = 7L;
		final Card card = new Card();
		
		context.checking(new Expectations() {{
			one(dao).get(with(equal(id)));
			will(returnValue(card));
		}});
			
		Card result = manager.get(id);
		assertSame(card, result);
	}
		
	@Test
    public void testGetPersons() {
        log.debug("testing getAllCards ...");
 
        final List cards = new ArrayList();
 
        // set expected behavior on dao
        context.checking(new Expectations() {{
            one(dao).getAll();
            will(returnValue(cards));
        }});
 
        List result = manager.getAll();
 
        assertSame(cards, result);
    }
	
	@Test
	public void testSaveCard() {
		log.debug("testing save Card ...");
		
		final Card card = new Card();
		card.setfName("John");
		card.setlName("Hannan");
		card.setTitle("P");
		
		//set expected behavior
		context.checking(new Expectations() {{
			one(dao).save(with(same(card)));
		}});
		manager.save(card);
		
	}
	
	
}
