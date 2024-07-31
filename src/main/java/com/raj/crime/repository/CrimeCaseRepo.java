package com.raj.crime.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.raj.crime.model.CrimeCase;
import jakarta.transaction.Transactional;


public interface CrimeCaseRepo {
	
    public void save(CrimeCase employee);
	
	public List<CrimeCase> findAll();
	
	public CrimeCase findById(int id);
	
	public void update(CrimeCase employee);
		
	public void delete(int id);

}
