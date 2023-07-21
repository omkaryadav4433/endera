package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Passaenger;
import com.app.repository.PassengerRepo;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepo prepo;
	@Autowired
	private ModelMapper maps;
	@Override
	public List<Passaenger> getAllPassaengers() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

	@Override
	public String deletePassenger(Long id) {
		Passaenger p=new Passaenger();
		
		if(prepo.existsById(id)) {
			prepo.deleteById(id);
		}
		
		
		return "passenger deleted";
	}

}
