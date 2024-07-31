package com.raj.crime.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.raj.crime.model.CrimeCase;
import com.raj.crime.model.Criminal;
import com.raj.crime.service.CriminalService;


@SpringBootTest
class CriminalServiceImplTest {

	@Autowired
	CriminalService criminalservice;
	
	@Test
	void testAddCriminal() {
		
		CrimeCase obj = new CrimeCase(1, 100, "Theft", "09-02-2001");
		Criminal cml = new Criminal(1,"Guna", "11-11-2002",obj);
		assertEquals("Success", criminalservice.addCriminal(cml));
	}
	
	@Test
	void testAddCriminal_NotFound() {
		Criminal obj = null;
		assertEquals("Failure", criminalservice.addCriminal(obj));
	}
	
	@Test
	void testUpdateCrime() {
		
		CrimeCase obj = new CrimeCase(1, 100, "Theft", "09-05-2024");
		Criminal cml = new Criminal(2,"Nandha", "11-11-2002",obj);
		criminalservice.addCriminal(cml);
		
		 Criminal retrievedcriminal = criminalservice.getCriminal(2);
		 retrievedcriminal.setName("Gokul");
		 assertEquals("Gokul", retrievedcriminal.getName());
		 assertEquals("Success",criminalservice.updateCriminal(retrievedcriminal));
	}
	
	@Test
	void testUpdateCrime_NotFound() {
		Criminal obj = null;
		assertEquals("Failure", criminalservice.updateCriminal(obj));
	}
	
	@Test
	 void testGetCriminal() {    
		
		CrimeCase obj = new CrimeCase(1, 100, "Murder", "24-02-2024");
		Criminal cml = new Criminal(2,"Naga", "11-11-2002",obj);
		criminalservice.addCriminal(cml);
		 Criminal retrievedcriminal = criminalservice.getCriminal(2);
	    assertNotNull(retrievedcriminal);
	    assertEquals("Naga", retrievedcriminal.getName());
	 }
	
	 @Test
	 void testGetCriminal_NotFound() {
       assertThrows(Exception.class, () -> criminalservice.getCriminal(999));
    }
	 
//	 @Test
//		void testGetAllCrime() {
//			assertEquals(13, criminalservice.getAllCriminal().size());
//		}
	 
		@Test
		void testGetAllCrime_NotFound() {
			assertThrows(Exception.class, () -> criminalservice.getCriminal(999));
		}

}
