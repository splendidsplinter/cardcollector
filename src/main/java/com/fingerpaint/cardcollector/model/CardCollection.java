package com.fingerpaint.cardcollector.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.appfuse.model.BaseObject;
import org.hibernate.annotations.Entity;

@Entity
public class CardCollection extends BaseObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date issueYear;
	private String issueCompany;
	
	@OneToMany(mappedBy = "collection")
	private Collection<Card> cards;
	
	public CardCollection(Long id, Date issueYear, String issueCompany) {
		super();
		this.id = id;
		this.issueYear = issueYear;
		this.issueCompany = issueCompany;
		this.cards = new HashSet<Card>();
	}

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(length = 4)
	public Date getIssueYear() {
		return issueYear;
	}

	public void setIssueYear(Date issueYear) {
		this.issueYear = issueYear;
	}

	@Column(length = 50)
	public String getIssueCompany() {
		return issueCompany;
	}

	public void setIssueCompany(String issueCompany) {
		this.issueCompany = issueCompany;
	}

	public Collection<Card> getCards() {
		return cards;
	}

	public void setCards(Collection<Card> cards) {
		this.cards = cards;
	}
	
	public void addToCards(Card card) {
		this.cards.add(card);
	}
		
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
