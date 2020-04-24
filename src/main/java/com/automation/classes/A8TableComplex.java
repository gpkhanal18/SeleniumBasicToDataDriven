package com.automation.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A8TableComplex {

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

			WebElement baseTable = driver.findElement(By.id("table1"));
			List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
            List<WebElement> tableDatas = baseTable.findElements(By.tagName("td"));
			
			System.out.println("no of rows are " + tableRows.size());
			System.out.println("no of contents are " + tableDatas.size());
			
			
			for (int i =0; i<tableRows.size(); i++) {
				System.out.println("i = " + i + " started");
				List<WebElement> dataOnThatRow = tableRows.get(i).findElements(By.tagName("td")); 
				
				System.out.println("j is less than " + dataOnThatRow.size());
				for(int j =0; j<dataOnThatRow.size(); j++) {
					System.out.println("i =" + i + " j=" + j + " value=" + dataOnThatRow.get(j).getText());
				}
				
			}
			
			
			Thread.sleep(2000);
			driver.quit();
			System.out.println("test pass successfully");

	}

}
