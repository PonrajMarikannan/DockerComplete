package com.raj.crime.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class LoginTest {
	
	@Test
	void testforLogin() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://localhost:3000/Login");
        driver.findElement(By.name("email")).sendKeys("ponrajmarikannan@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("lbutton")).click();
        Thread.sleep(7000);
        String currentUrl = driver.getCurrentUrl();
        assertEquals("http://localhost:3000/Home", currentUrl);
        driver.quit();
    }
	
	@Test
	void testforRegister() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/Login");
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		String currentUrl = driver.getCurrentUrl();
		assertEquals("http://localhost:3000/Signup", currentUrl);
		driver.quit();
	}
	
	@Test
	void testforGoBack() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/Login");
		driver.findElement(By.name("back")).click();
		driver.navigate().back();
		driver.quit();	
	}
	
	@Test
	void InvalidEmailLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://localhost:3000/Login");
        driver.findElement(By.name("email")).sendKeys("ponraj");
        driver.findElement(By.name("lbutton")).submit();
        Thread.sleep(3000);
	    WebElement webElement = driver.findElement(By.name("error"));
	    assertEquals("Please enter a valid email address", webElement.getText());
	    Thread.sleep(3000);
	    driver.quit();
	}
	
	@Test
	void InvalidPasswordLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/Login");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("ponrajmarikannan@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("lbutton")).submit();
		Thread.sleep(3000);
		WebElement webElement = driver.findElement(By.name("error"));
		assertEquals("Password must be at least 6 characters long", webElement.getText());
		Thread.sleep(3000);
		driver.quit();
	}

}
