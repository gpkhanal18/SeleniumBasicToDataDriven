package com.automation.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A5CheckBox {

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

		driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
		Thread.sleep(3000);
		
		
	// add logic for check boxes 
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		checkboxes.get(0).click();
		checkboxes.get(1).click();
		
		if (checkboxes.get(0).isSelected()) {
			System.out.println("checkbox 1 is selected");
		}
		if (checkboxes.get(1).isSelected()) {
			System.out.println("checkbox 2 is selected");
		}
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("test pass successfully");

	}

}
