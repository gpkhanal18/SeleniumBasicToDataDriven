package com.testng.datadriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenLoginOptimized {

	public WebDriver driver;

	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException {
		ReadExcel read = new ReadExcel();
		return read.getCellData("TestData/LoginValues.xls", "Sheet1");

	}

	@BeforeSuite
	public void launchApp() {
		System.setProperty("webdriver.gecko.driver", "//Users//gopalkhanal//Downloads//Driver//geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();

	}

	@Test(testName = "datadriven", dataProvider = "getExcelData")
	public void testHerokuLogin(String Username, String Password) throws InterruptedException {

		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button")).click();

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}