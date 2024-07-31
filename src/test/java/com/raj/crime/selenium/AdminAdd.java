package com.raj.crime.selenium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AdminAdd {

	@Test
	void test() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/AddCrim");
		Thread.sleep(2000);
        driver.findElement(By.name("name")).sendKeys("Giri");
		driver.findElement(By.name("dob")).sendKeys("22-08-1999");
		Thread.sleep(4000);
		driver.findElement(By.name("selectedId")).click();
	    WebElement dropdown = driver.findElement(By.name("selectedId"));
	    dropdown.findElement(By.xpath("//option[. = '14']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.name("AdminAdd")).click();
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
	    assertEquals("http://localhost:3000/ViewCrim", currentUrl);
		driver.quit();
	}

}
