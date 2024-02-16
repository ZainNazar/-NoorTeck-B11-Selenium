package com.noorteck.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

//Step 1. we need to call setProperty () from system and pass2 parameter
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\zalkh\\Desktop\\Selenium_b11\\geckodriver.exe");

//Step 2. Create an Object of WebDriver

		WebDriver driver = new FirefoxDriver();

		// now we can navigate to the URL
		driver.get("https://www.expedia.com");

		Thread.sleep(5000);
		driver.quit();
	}

}


 
/**
	firefox: Key --> webdriver.gecko.driver
	chrome:  Key --> webdriver.chrome.driver
	
	edge:    Key --> webdriver.edge.driver
	
	safari:  Key --> webdriver.safari.driver
*/

 

