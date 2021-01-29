package com.automation.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1WebsiteTitle {
	
    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","//Users//gopalkhanal//Downloads//Driver//geckodriver");
//		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
    	
//		/Users/gopalkhanal/Downloads/Driver
		
        String baseUrl = "http://google.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        driver.findElement(By.name("q")).sendKeys("i am typing");
        Thread.sleep(5000);

        added as part of feature 1

        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        
        
   
        
        driver.quit();
        
        
    }     

}
