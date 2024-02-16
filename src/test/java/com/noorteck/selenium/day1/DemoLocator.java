package com.noorteck.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoLocator extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		/*
		 * driver.get("https://www.amazon.com");
		 * 
		 * WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		 * 
		 * searchField.sendKeys("Selenium Webdriver");
		 * 
		 * WebElement searchButton =
		 * driver.findElement(By.id("nav-search-submit-button")); searchButton.click();
		 */

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");

		Thread.sleep(2000);

		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("ntk-admin");

		Thread.sleep(1000);

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");

		Thread.sleep(1000);

		WebElement clickButton = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		clickButton.click();

		driver.get("https://www.yahoo.com/");

		WebElement sportlink = driver.findElement(By.linkText("Sports"));
		sportlink.click();

		WebElement signLing = driver.findElement(By.partialLinkText("Sign"));
		signLing.click();

		driver.get("https://www.google.com/");

		WebElement searchGog = driver.findElement(By.cssSelector("#APjFqb"));
		searchGog.sendKeys("Selenium is Fun");

		tearDown();

	}

}

// oxd-button oxd-button--medium oxd-button--main orangehrm-login-button
