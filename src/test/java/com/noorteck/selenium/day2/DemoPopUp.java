package com.noorteck.selenium.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoPopUp extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://www.letskodeit.com/practice");

		WebElement alertBtn = driver.findElement(By.id("alertbtn"));

		WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));

		alertBtn.click();
		Thread.sleep(2000);
		// to Handle pop-up we need to switch control from browser to the alert
		Alert alertObj = driver.switchTo().alert();

		String text = alertObj.getText();
		System.out.println(text);

		// Click OK
		alertObj.accept();

		System.out.println("********");

		confirmBtn.click();

		Alert confirmObj = driver.switchTo().alert();

		String text2 = confirmObj.getText();
		System.out.println(text2);

		Thread.sleep(2000);
		confirmObj.dismiss();

		String pageTitle = driver.getTitle();
		
		System.out.println("Page Title: "+pageTitle);

		tearDown();

	}

}
