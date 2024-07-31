package com.raj.crime.service;

import java.util.List;

import com.raj.crime.model.Criminal;


public interface CriminalService {
	
	public String addCriminal(Criminal cml);
	public List<Criminal> getAllCriminal();
	public Criminal getCriminal(int id);
	public String updateCriminal(Criminal cml);
	public void deleteCriminalById(int id);
}
