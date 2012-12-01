package com.fingerpaint.cardcollector.model;

import org.appfuse.model.BaseObject;

public class Card extends BaseObject{
	
	private Long id;
	private String fName;
	private String lName;
	private String title;
	private String description;
	
	private Statistics stats;

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
