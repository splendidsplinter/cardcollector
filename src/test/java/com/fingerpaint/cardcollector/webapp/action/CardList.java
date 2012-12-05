package com.fingerpaint.cardcollector.webapp.action;

import java.io.Serializable;
import java.util.List;

import org.appfuse.service.GenericManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fingerpaint.cardcollector.model.Card;

@Scope("request")
@Component("cardList")
public class CardList extends BasePage implements Serializable {

	private GenericManager<Card, Long> cardManager;
	
	@Autowired
	public void setCardManager(@Qualifier("cardManager") GenericManager<Card, Long> cardManager)
	{
		this.cardManager = cardManager;

	}
	
	public CardList() {
		setSortColumn("id");
	}
	
	public List getCards() {
		return sort(cardManager.getAll());
	}
}
