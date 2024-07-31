//package com.raj.crime.selenium;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Alert;
//
//class AdminDelete {
//
//	@Test
//	void DeleteDataPage() throws InterruptedException {
//	    WebDriver driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.get("http://localhost:3000/ViewCrim");
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.name("delete-8")).click();
//	    
//	    Alert alert = driver.switchTo().alert(); 
//	    
//	    String alertMessage= driver.switchTo().alert().getText(); 
//	     
//	    System.out.println(alertMessage); 
//	    Thread.sleep(5000);
//	    alert.accept(); 
//	    
//	    Thread.sleep(3000);
//	    String currentUrl = driver.getCurrentUrl();
//	    
//	    assertEquals("http://localhost:3000/ViewCrim", currentUrl);
//	    
//	    String pageSource = driver.getPageSource();
//	    assertFalse(pageSource.contains("prabha")); 
//	    
//	    driver.quit();
//	}
//
//	
//
//}
