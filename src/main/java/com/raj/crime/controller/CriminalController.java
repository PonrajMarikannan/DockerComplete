package com.raj.crime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.crime.model.Criminal;
import com.raj.crime.serviceImpl.CriminalServiceImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
 
 
@CrossOrigin("*")

@RestController
@RequestMapping("/criminal")
public class CriminalController {
 
	@Autowired
	CriminalServiceImpl serviceImpl;
	
	@PostMapping
	public String insertPayroll(@RequestBody Criminal cml) {
		String msg="";
		try {
			serviceImpl.addCriminal(cml);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Criminal getCriminalById(@PathVariable("id") int id) {
		return serviceImpl.getCriminal(id);
	}
 
	@GetMapping("/all")
	public List<Criminal> viewallPayroll() {
		return serviceImpl.getAllCriminal();
	}
	
	@PutMapping
	public String updatePayroll(@RequestBody Criminal pay) {
		String msg = "";
		try {
			serviceImpl.updateCriminal(pay);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteCriminalById(@PathVariable("id") int id) {
		String msg="";
		try {
			serviceImpl.deleteCriminalById(id);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}

