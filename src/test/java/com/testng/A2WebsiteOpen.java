package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class A2WebsiteOpen {

	WebDriver driver;
	
	

	@BeforeMethod
	public void beforeTest() {
		System.out.println("i am before test");
		System.setProperty("webdriver.gecko.driver", "//Users//gopalkhanal//Downloads//Driver//geckodriver");
		// WebDriver driver = new ChromeDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		driver = new FirefoxDriver();

		String baseUrl = "http://the-internet.herokuapp.com/";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);
	}

	@Test(groups="sprint3-regression", priority=2, dependsOnMethods="login")
	public void dropDown() throws InterruptedException {

		System.out.println("I am website title test");

		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		Thread.sleep(3000);
		
		
		// add logic to select dropdown menus 
		Select dropdownList = new Select(driver.findElement(By.id("dropdown")));
		dropdownList.selectByVisibleText("Option 1");
		
		
		
		Thread.sleep(2000);

	}

	@Test(priority=1)
	@Parameters({"username", "password"})
	public void login(String username, String password) throws InterruptedException {

		System.out.println("I am formfill test");

		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Assert.assertEquals("gopal", "khanal");

	}

	@AfterMethod
	public void afterTest() {
		System.out.println("i am after test");
		driver.quit();
	}

}
