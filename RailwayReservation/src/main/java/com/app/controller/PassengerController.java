package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Passaenger;
import com.app.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	private PassengerService passSer;
	
	@PostMapping
	public List<Passaenger>getAllPassaengers(){
		return passSer.getAllPassaengers();
	}
	
	@DeleteMapping("/{id}")
	public String deletePassenger(@PathVariable Long id) {
		passSer.deletePassenger(id);
		return "passenger deleted";
		
	}
	

}
