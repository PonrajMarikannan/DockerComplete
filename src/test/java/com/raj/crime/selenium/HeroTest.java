package com.raj.crime.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class HeroTest {

	private WebDriver driver;
	 
		@BeforeEach
		public void setUp() {
			driver = new ChromeDriver();
	 
		}
	 
		@AfterEach
		public void tearDown() {
			driver.quit();
		}
	
	@Test
	void testforGetStartedButton() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Get started")).click();	
	}
	
	@Test
	void testforLoginButton() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/");
		Thread.sleep(16000);
		driver.findElement(By.linkText("Log In")).click();
	}

}