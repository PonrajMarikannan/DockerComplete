package com.raj.crime.repoImplementation;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raj.crime.model.CrimeCase;
import com.raj.crime.repository.CrimeCaseRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CrimeCaseRepoImpli implements CrimeCaseRepo{
	
	@Autowired
	EntityManager eManager;
	
	public void save(CrimeCase crime) {
		eManager.merge(crime);
	}
	
	public List<CrimeCase> findAll() {
		String hql = "from CrimeCase";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}
	
		public CrimeCase findById(int id) {
			return eManager.find(CrimeCase.class, id);
		}
		
		@Override
		public void update(CrimeCase crime) {
			eManager.merge(crime);
		}
		
		@Override
		public void delete(int id) {
			CrimeCase e = eManager.find(CrimeCase.class, id);
			eManager.remove(e);
		}
}
