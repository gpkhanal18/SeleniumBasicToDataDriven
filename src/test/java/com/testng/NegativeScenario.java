package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NegativeScenario {

	@Test(expectedExceptions = Exception.class)
	public void testNegativeScenatio() {

		String title = null;
		System.out.println(title.charAt(1));

	}

	@Test
	public void testNegativeScenatio_fail() {

		String title = null;
		System.out.println(title.charAt(1));

	}

	@Test
	public void testNegativeScenatio_should_fail() {
		WebDriver driver = new FirefoxDriver();

		try {
			System.setProperty("webdriver.gecko.driver", "//Users//gopalkhanal//Downloads//Driver//geckodriver");
			// WebDriver driver = new ChromeDriver();
			// comment the above 2 lines and uncomment below 2 lines to use Chrome
			// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");

			// /Users/gopalkhanal/Downloads/Driver

			String baseUrl = "http://the-internet.herokuapp.com/";

			// launch Fire fox and direct it to the Base URL
			driver.get(baseUrl);

			driver.findElement(By.xpath("//a[@href='/login-invalidxpath']")).click();
		} catch (Exception e) {
				System.out.println("xpath was not found");
		} finally {
			driver.quit();
		}

	}

}
