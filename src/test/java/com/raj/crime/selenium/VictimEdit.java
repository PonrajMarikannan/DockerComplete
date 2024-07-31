package com.raj.crime.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class VictimEdit {

	@Test
	void EditButton() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/ViewCom");
		Thread.sleep(2000);
		driver.findElement(By.name("edit")).click();
		String currentUrl = driver.getCurrentUrl();
	    assertEquals("http://localhost:3000/EditCom/1", currentUrl);
	    driver.quit();
	}
	
	@Test
	void UpdateDataPage() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/EditCom/1");
		Thread.sleep(2000);
		String newValue = "Murder"; 
		WebElement descriptionTextBox = driver.findElement(By.name("casedescription"));
		Thread.sleep(2000);
		descriptionTextBox.clear();
		Thread.sleep(4000);
		descriptionTextBox.sendKeys(newValue);
		driver.findElement(By.name("ubutton")).click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		assertEquals("http://localhost:3000/ViewCom", currentUrl);
		driver.quit();
	}
	

}
