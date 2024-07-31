package com.raj.crime.selenium;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AdminView {

	@Test
	void ViewPageAddCriminal() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/AdminHome");
		Thread.sleep(5000);
		driver.findElement(By.name("Acrim")).click();
		Thread.sleep(5000);
		String currentUrl = driver.getCurrentUrl();
		assertEquals("http://localhost:3000/AddCrim", currentUrl);
		driver.quit();
	}

	@Test
	void ViewPageViewCriminal() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/AdminHome");
		Thread.sleep(5000);
		 driver.findElement(By.name("Vcrim")).click();
	     Thread.sleep(5000);
		 String currentUrl = driver.getCurrentUrl();
		 assertEquals("http://localhost:3000/ViewCrim", currentUrl);
		 driver.quit();
	}
	
	
}
