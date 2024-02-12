package a.homework.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class ExerciseTwo extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.get("https://demo.guru99.com/test/newtours/");

		Thread.sleep(2000);
		WebElement goRegister = driver.findElement(By.linkText("REGISTER"));
		goRegister.click();

		String title = driver.getTitle();

		if (title.equals("Register: Mercury Tours")) {

			WebElement fName = driver.findElement(By.name("firstName"));
			fName.sendKeys("Zain");
			Thread.sleep(400);

			WebElement lName = driver.findElement(By.name("lastName"));
			lName.sendKeys("Alkhoja");
			Thread.sleep(400);

			WebElement phoneNum = driver.findElement(By.name("phone"));
			phoneNum.sendKeys("12345");
			Thread.sleep(400);

			WebElement myEmail = driver.findElement(By.id("userName"));
			myEmail.sendKeys("zain@yahoo.com");
			Thread.sleep(400);

			WebElement address = driver.findElement(By.name("address1"));
			address.sendKeys("Katy");
			Thread.sleep(400);

			WebElement city = driver.findElement(By.name("city"));
			city.sendKeys("katy");
			Thread.sleep(400);

			WebElement state = driver.findElement(By.name("state"));
			state.sendKeys("Texas");
			Thread.sleep(400);

			WebElement zipCode = driver.findElement(By.name("postalCode"));
			zipCode.sendKeys("77777");
			Thread.sleep(400);

			WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys("Zain88");

			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("asdqwe");

			WebElement repassword = driver.findElement(By.name("confirmPassword"));
			repassword.sendKeys("asdqwe");
			Thread.sleep(1000);

			WebElement submitButton = driver.findElement(By.name("submit"));
			submitButton.click();
			Thread.sleep(2000);

			WebElement confirMessage = driver.findElement(By.cssSelector(
					"body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(2) > font"));

			String checkConfirm = confirMessage.getText();
			if (checkConfirm.contains("Thank you for registering.")) {
				System.out.println("TestCase PASSED");
			}

			else {
				System.out.println("TestCase Failed");
			}
		}

		tearDown();

	}

}
