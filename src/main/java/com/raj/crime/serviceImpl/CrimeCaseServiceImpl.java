package com.raj.crime.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raj.crime.model.CrimeCase;
import com.raj.crime.repository.CrimeCaseRepo;
import com.raj.crime.service.CrimeCaseService;


@Service
public class CrimeCaseServiceImpl implements CrimeCaseService {

	@Autowired
	CrimeCaseRepo repo;
		
	@Override
	public String addCrime(CrimeCase crime) {
		if(crime!=null) {
	        repo.save(crime);
	        return "Success";
		}else {
			return "Failure";
		}
	}
	
	@Override
	public CrimeCase getCrime(int id) {
		
		CrimeCase optionalCrime = repo.findById(id);
		 
        if (optionalCrime!=null) {
            return optionalCrime;
        } else {
            throw new RuntimeException("Crime not found with id: " + id);
        }    
	}
	
	@Override
	public List<CrimeCase> getAllCrime() {
		return repo.findAll();
	}
	
	@Override
	public String updateCrime(CrimeCase crime) {
		
		if(crime!=null) {
	        repo.save(crime);
	        return "success";
		}
		else {
			return "Failure";
		}
		
	}

	
	public String deleteCrime(int id) {
		
		CrimeCase optionalCrime = repo.findById(id);
		 
        if (optionalCrime!=null) {
        	repo.delete(id);
            return "Success";
        } else {
            throw new RuntimeException("Crime not found with id: " + id);
        }   
    }
	
}
