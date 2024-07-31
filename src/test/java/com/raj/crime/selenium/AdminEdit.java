package com.raj.crime.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AdminEdit {

	@Test
	void EditButton() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/ViewCrim");
		Thread.sleep(2000);
		driver.findElement(By.name("edit-2")).click();
		String currentUrl = driver.getCurrentUrl();
	    assertEquals("http://localhost:3000/EditCrim/2", currentUrl);
	    driver.quit();
	}
	
	@Test
	void UpdateDataPage() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/EditCrim/2");
		Thread.sleep(2000);
		
		String name = "Vasanth"; 
		WebElement descriptionTextBox = driver.findElement(By.name("name"));
		Thread.sleep(2000);
		descriptionTextBox.clear();
		Thread.sleep(4000);
		descriptionTextBox.sendKeys(name);
		driver.findElement(By.name("ubutton")).click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		assertEquals("http://localhost:3000/AdminHome", currentUrl);
		driver.quit();
	}
	

}
