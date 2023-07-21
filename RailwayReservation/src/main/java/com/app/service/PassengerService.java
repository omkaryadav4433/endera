package com.app.service;

import java.util.List;

import com.app.entities.Passaenger;

public interface PassengerService {
	List<Passaenger>getAllPassaengers();
	
	
	//String addpassenger(Passaengerdto pt);
	
	
	String deletePassenger(Long id);
	
	
	//PassaengerDto getpassenger(long id);

}
