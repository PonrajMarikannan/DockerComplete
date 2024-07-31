package com.raj.crime.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class VictimAdd {

	@Test
	void test() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/AddCom");
		Thread.sleep(2000);
        driver.findElement(By.name("casenumber")).sendKeys("10");
		driver.findElement(By.name("casedescription")).sendKeys("Muder");
		driver.findElement(By.name("dateoccour")).sendKeys("11-12-2002");
		Thread.sleep(2000);
		driver.findElement(By.name("Vadd")).click();
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
	    assertEquals("http://localhost:3000/Home", currentUrl);
		driver.quit();
	}

}
