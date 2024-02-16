package todoor.practice.selenium;

import org.testng.annotations.Test;

import utils.Hooks;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class BuyRealMadridJersey extends Hooks {

	@BeforeMethod
	public void beforeMethod() {

		setUp();
		driver.get("https://www.amazon.com/");
	}

	@Test
	public void addRealMadrid() throws InterruptedException {

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Real Madrid Jersey");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1500);

		WebElement pickAJersey = driver.findElement(By.xpath("//span[contains(text(),'Figo')]"));
		pickAJersey.click();
		Thread.sleep(1500);

		WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
		addCart.click();

		Thread.sleep(3000);

		WebElement newsearch = driver.findElement(By.id("twotabsearchtextbox"));
		newsearch.sendKeys("Real Madrid Bag");
		newsearch.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		WebElement pickAShoes = driver
				.findElement(By.xpath(" //span[text()='Official Real Madrid Backpack - Multiple Compartment Style']"));
		pickAShoes.click();
		Thread.sleep(1500);
		WebElement newaddCart = driver.findElement(By.id("add-to-cart-button"));
		newaddCart.click();

		WebElement showCart = driver.findElement(By.id("nav-cart-count"));
		showCart.click();

		List<WebElement> total = driver.findElements(By.xpath(""));

		Thread.sleep(3000);
	}

	@Test
	public void addShoes() throws InterruptedException {

		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Real Madrid Bag");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1500);

		WebElement pickAJersey = driver
				.findElement(By.xpath(" //span[text()='Official Real Madrid Backpack - Multiple Compartment Style']"));
		pickAJersey.click();
		Thread.sleep(1500);

		WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
		addCart.click();

		Thread.sleep(3000);
	}

	@AfterMethod
	public void afterMethod() {

		tearDown();
	}

}
