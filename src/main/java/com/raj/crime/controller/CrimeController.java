package com.raj.crime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.crime.model.CrimeCase;
import com.raj.crime.serviceImpl.CrimeCaseServiceImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
 
 
@CrossOrigin("*")
@RestController
@RequestMapping("/crime")
public class CrimeController {
 
	@Autowired
	CrimeCaseServiceImpl serviceImpl;
	
	@PostMapping
	public String insertCrime(@RequestBody CrimeCase crime) {
		String msg="";
		try {
			msg = serviceImpl.addCrime(crime);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public CrimeCase getCrimebyId(@PathVariable("id") int id) {
		return serviceImpl.getCrime(id);
	}
 
	@GetMapping("/all")
	public List<CrimeCase> viewallEmployee() {
		return serviceImpl.getAllCrime();
	}
	
	@PutMapping
	public String updateCrime(@RequestBody CrimeCase crime) {
		String msg = "";
		try {
			serviceImpl.updateCrime(crime);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteCrimebyId(@PathVariable("id") int id) {
		String msg="";
		try {
			serviceImpl.deleteCrime(id);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}
