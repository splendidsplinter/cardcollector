package com.fingerpaint.cardcollector.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.appfuse.service.GenericManager;

import com.fingerpaint.cardcollector.model.Card;

@WebService
@Path("/card")
public interface CardManager extends GenericManager<Card, Long>{
	
	@GET
	@Path("{lName}")
	List<Card> findByLastName(@PathParam("lName") String lName);
}
