package com.automation.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A6RadioButton {
	
    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.gecko.driver", "//Users//gopalkhanal//Downloads//Driver//geckodriver");
		// WebDriver driver = new ChromeDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();

		// /Users/gopalkhanal/Downloads/Driver

		String baseUrl = "http://demo.guru99.com/test/radio.html";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);		
		
		
		
		
		driver.findElement(By.id("vfb-7-1")).click();							
        driver.findElement(By.id("vfb-7-2")).click();
        
        Thread.sleep(3000);

		driver.quit();
		System.out.println("test pass successfully");
        
        
    }     

}
