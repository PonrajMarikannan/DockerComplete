package com.raj.crime.selenium;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class VictimView {

	@Test
	void ViewPageFileComplaint() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/Home");
		Thread.sleep(5000);
		driver.findElement(By.name("Fcom")).click();
		Thread.sleep(5000);
		String currentUrl = driver.getCurrentUrl();
		assertEquals("http://localhost:3000/AddCom", currentUrl);
		driver.quit();
	}

	@Test
	void ViewPageViewComplaint() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/Home");
		Thread.sleep(5000);
		 driver.findElement(By.name("Vcom")).click();
	     Thread.sleep(5000);
		 String currentUrl = driver.getCurrentUrl();
		 assertEquals("http://localhost:3000/ViewCom", currentUrl);
		 driver.quit();
	}
	
	
}
