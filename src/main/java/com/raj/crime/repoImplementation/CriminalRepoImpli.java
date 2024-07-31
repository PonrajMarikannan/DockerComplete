package com.raj.crime.repoImplementation;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.raj.crime.model.Criminal;
import com.raj.crime.repository.CriminalRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CriminalRepoImpli implements CriminalRepo{
	
	@Autowired
	EntityManager eManager;
	
	public String save(Criminal cml) {
		eManager.merge(cml);
		return "Success";
	}
	
	public List<Criminal> findAll() {
		String hql = "from Criminal";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}
	
	public Criminal findById(int id) {
		return eManager.find(Criminal.class, id);
	}
	
	@Override
	public String update(Criminal cml) {
		eManager.merge(cml);
		return "Success";
	}
	
	@Override
	public void deleteById(int id) {
		Criminal p = eManager.find(Criminal.class, id);
		eManager.remove(p);
	}

}

