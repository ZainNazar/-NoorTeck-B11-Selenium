package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoRadio2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://www.letskodeit.com/practice");

		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		WebElement hondaRadio = driver.findElement(By.id("hondaradio"));

		bmwRadio.click();
		Thread.sleep(2000);

		benzRadio.click();
		Thread.sleep(2000);

		hondaRadio.click();
		Thread.sleep(2000);

		System.out.println("Bmw:  " + bmwRadio.isSelected());
		System.out.println("Benz:  " + benzRadio.isSelected());
		System.out.println("Honda:  " + hondaRadio.isSelected());

		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		WebElement showHideTextField = driver.findElement(By.id("displayed-text"));

		System.out.println("Click the Hide Button");
		hideButton.click();

		System.out.println("is TextField Displayed ?  " + showHideTextField.isDisplayed());

		System.out.println("Click the Show Button");
		showButton.click();
		System.out.println("is TextField Displayed ?  " + showHideTextField.isDisplayed());

		System.out.println("***************");

		System.out.println("Enable&Disable Text Field Example.....");

		WebElement enableButtton = driver.findElement(By.id("enabled-button"));
		WebElement disableButtton = driver.findElement(By.id("disabled-button"));
		WebElement enableDisableTextField = driver.findElement(By.id("enabled-example-input"));
		
		System.out.println("Click On Disable");
		disableButtton.click();
		System.out.println("is TextField Enabled???"+enableDisableTextField.isEnabled());
		
		System.out.println("Click On Enable");
		enableButtton.click();
		System.out.println("is TextField Enabled???"+enableDisableTextField.isEnabled());

		tearDown();

	}

}
