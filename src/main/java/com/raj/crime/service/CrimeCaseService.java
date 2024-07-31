package com.raj.crime.service;

import java.util.List;
import com.raj.crime.model.CrimeCase;


public interface CrimeCaseService {
	
	public String addCrime(CrimeCase crime);
	public List<CrimeCase> getAllCrime();
	public CrimeCase getCrime(int id);
	public String updateCrime(CrimeCase crime);
	public String deleteCrime(int id);
}
 