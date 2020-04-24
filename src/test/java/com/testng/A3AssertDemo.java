package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A3AssertDemo {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "//Users//gopalkhanal//Downloads//Driver//geckodriver");
		 driver = new FirefoxDriver();

		String baseUrl = "http://google.com";
		driver.get(baseUrl);
	}

	@Test
	public void titleValidation() throws InterruptedException {

		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		System.out.println("inside title validation");
		
		driver.findElement(By.name("q")).sendKeys("i am typing");
		System.out.println("inside title validation2");
		Thread.sleep(5000);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
