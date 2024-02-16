package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DemoRadio3 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://www.letskodeit.com/practice");

		WebElement carDropDown = driver.findElement(By.id("carselect"));

		Select selectCar = new Select(carDropDown);

		selectCar.selectByIndex(1);
		Thread.sleep(1500);
		selectCar.selectByIndex(0); // BY INDEX
		Thread.sleep(1500);
		selectCar.selectByIndex(2);
		Thread.sleep(1500);

		selectCar.selectByValue("bmw"); // By VALUE
		Thread.sleep(1500);
		selectCar.selectByVisibleText("Benz"); // BY VISIBLE TEXT
		Thread.sleep(1500);
		
		
		tearDown();

	}

}
