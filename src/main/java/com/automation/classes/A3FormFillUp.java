package com.automation.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A3FormFillUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "//Users//gopalkhanal//Downloads//Driver//geckodriver");
		// WebDriver driver = new ChromeDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();

		// /Users/gopalkhanal/Downloads/Driver

		String baseUrl = "http://the-internet.herokuapp.com/";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("usergopal");
		driver.findElement(By.name("password")).sendKeys("passwordgopal");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("test pass successfully");

	}

}
