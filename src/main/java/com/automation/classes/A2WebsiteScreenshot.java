package com.automation.classes;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2WebsiteScreenshot {

	public static void main(String[] args) throws Exception {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver", "//Users//gopalkhanal//Downloads//Driver//geckodriver");
		// WebDriver driver = new ChromeDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		// added as part of feature1.
		// /Users/gopalkhanal/Downloads/Driver
		// feature 1 more added
		// feature 1 more added
		// added from feature 2
		String baseUrl = "www.google.com";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);
		
		driver.findElement(By.name("q")).sendKeys("corona virus");

		
		
		
//		takeSnapShot(driver, "/Users/gopalkhanal/Desktop/QA/screenshots/autoScreenshot.png");
//
//		
//		driver.quit();
//		System.out.println("test pass successfully");

	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
