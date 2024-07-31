package com.raj.crime.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raj.crime.model.Register;
import com.raj.crime.repository.RegisterRepo;
import com.raj.crime.service.RegisterService;



@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepo repo;
		
	@Override
	public void addUser(Register user) {
        repo.save(user);
	}
	
	

	
	public Register getUserByEmail(String email) {
		return repo.findByEmail(email);
	}

	@Override
	public Register findByUserName(String email) {
		return repo.findByEmail(email);
	}
	
}
