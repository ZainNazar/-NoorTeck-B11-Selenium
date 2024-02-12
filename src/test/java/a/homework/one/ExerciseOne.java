package a.homework.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class ExerciseOne extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.get("https://ntkhr.noortecktraining.com");
		Thread.sleep(2000);

		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("ntk-admin");

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(2000);

		WebElement clickLogin = driver.findElement(By.tagName("button"));
		clickLogin.click();
		Thread.sleep(2000);

		WebElement headerT = driver.findElement(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6"));
		System.out.println(" Dashboard is The Header ? " + headerT.isDisplayed());

		tearDown();

	}

}
