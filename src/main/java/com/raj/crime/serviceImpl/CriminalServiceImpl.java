package com.raj.crime.serviceImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raj.crime.model.Criminal;
import com.raj.crime.repository.CriminalRepo;
import com.raj.crime.service.CriminalService;

@Service
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	CriminalRepo repo;
	
	public String addCriminal(Criminal cml) {
		
		if(cml!=null) {
	        repo.save(cml);
	        return "Success";
		}else {
			return "Failure";
		}
	}
	
	public List<Criminal> getAllCriminal() {
		return repo.findAll();
	}
	
	
	public Criminal getCriminal(int id) {
		
		Criminal optionalCrime = repo.findById(id);
		 
        if (optionalCrime!=null) {
            return optionalCrime;
        } else {
            throw new RuntimeException("Criminal not found with id: " + id);
        }    
		
}
	
	public String updateCriminal(Criminal cml) {
		
		if(cml!=null) {
	        repo.update(cml);
	        return "Success";
		}
		else {
			return "Failure";
		}
	}
 
	public void deleteCriminalById(int id) {
		repo.deleteById(id);
	}
}
