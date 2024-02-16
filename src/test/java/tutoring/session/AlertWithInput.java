package tutoring.session;

import org.testng.annotations.Test;

import utils.Hooks;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class AlertWithInput extends Hooks {


	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		setUp();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
	}

	@Test
	public void f() throws InterruptedException {

		
		WebElement alrtText = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alrtText.click();
		Thread.sleep(1000);
		WebElement btnPrompt = driver.findElement(By.cssSelector("#Textbox > button"));
		btnPrompt.click();

		Alert altrBox = driver.switchTo().alert();
		altrBox.sendKeys("Zain");
		Thread.sleep(2000);
		altrBox.accept();

	}

	@AfterMethod
	public void afterMethod() {

		tearDown();
	}

}
