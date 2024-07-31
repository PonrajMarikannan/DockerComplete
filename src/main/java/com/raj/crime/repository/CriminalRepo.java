package com.raj.crime.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.raj.crime.model.Criminal;



public interface CriminalRepo  {

	public String save(Criminal cml);
	
	public List<Criminal> findAll();

	public Criminal findById(int id);

	public String update(Criminal cml);

	public void deleteById(int id);

}
