package com.automation.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A7TableSimple {

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

			driver.findElement(By.xpath("//a[@href='/tables']")).click();
			Thread.sleep(3000);
			
			
			// add logic for handling table here

			// task get email for Does Jason 
			//table[@id='table1']/tbody[1]/tr[3]/td[3]
			
			String doeEmail = driver.findElement(By.xpath("//table[@id='table1']/tbody[1]/tr[3]/td[3]")).getText();
			System.out.println("doe's email is " + doeEmail);
			
			Thread.sleep(2000);
			driver.quit();
			System.out.println("test pass successfully");

	}

}
