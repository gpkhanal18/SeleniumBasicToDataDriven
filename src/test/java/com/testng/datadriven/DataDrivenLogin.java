package com.testng.datadriven;

import java.io.IOException;

//import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenLogin {

	public WebDriver driver;

	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException {
		ReadExcel read = new ReadExcel();
		System.out.println("print 1");
		String[][] a =  read.getCellData("TestData/LoginValues.xls", "Sheet2");
		System.out.println(a.toString());
		System.out.println("i will return a");
		return a;
	}

	@BeforeSuite
	public void launchApp() {
		System.setProperty("webdriver.gecko.driver", "//Users//gopalkhanal//Downloads//Driver//geckodriver");
		driver = new FirefoxDriver();
		System.out.println("print 2");
	}

	@Test(testName = "datadriven", dataProvider = "getExcelData", enabled=true)
	public void datadriven(String Username, String Password) throws InterruptedException {
		System.out.println("print 3");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		System.out.println("i am inside datadriven");
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/login']")).click();

		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button")).click();

	}

	@AfterSuite
	public void closeBrowser() {
		System.out.println("print 4");
		driver.quit();
		System.out.println("print 5");
	}
}