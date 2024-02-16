package todoor.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoToDoor extends Hooks {

	public static void main(String[] args) {

		setUp();

		driver.get("https://www.todoor.shop/");

		WebElement firstName = driver.findElement(By.cssSelector("#ztplq8 > form > div:nth-child(1) > input"));
		firstName.sendKeys("Zain");

		WebElement lastName = driver.findElement(By.cssSelector("#ztplq8 > form > div:nth-child(2) > input"));
		lastName.sendKeys("Alkhoja");

		WebElement email = driver.findElement(By.cssSelector("#ztplq8 > form > div:nth-child(3) > input"));
		email.sendKeys("zalkhoja10@gmail.com");

		WebElement message = driver.findElement(By.cssSelector("#ztplq8 > form > div:nth-child(4) > textarea"));
		message.sendKeys("Hello I'M QA Tester And I Test Your Website .... That's COOL");

		WebElement phoneNum = driver.findElement(By.cssSelector("#ztplq8 > form > div:nth-child(5) > input"));
		phoneNum.sendKeys("009627966");

		WebElement clickButton = driver.findElement(By.name("submit"));
		clickButton.click();

		tearDown();

	}

}
