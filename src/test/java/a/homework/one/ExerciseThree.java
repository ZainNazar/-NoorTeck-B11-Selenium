package a.homework.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class ExerciseThree extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.nopcommerce.com/");

		Thread.sleep(2009);

		WebElement clickRegister = driver.findElement(By.linkText("Register"));
		clickRegister.click();

		String title = driver.getTitle();

		if (title.equals("nopCommerce demo store. Register")) {

			WebElement gender = driver.findElement(By.name("Gender"));
			gender.click();

			WebElement fName = driver.findElement(By.name("FirstName"));
			fName.sendKeys("Zain");

			WebElement lName = driver.findElement(By.name("LastName"));
			lName.sendKeys("Alkhoja");
			Thread.sleep(2000);

			WebElement dateOfBirth = driver.findElement(By.name("DateOfBirthDay"));
			Select selectDay = new Select(dateOfBirth);
			selectDay.selectByVisibleText("9");

			WebElement dateOfMonth = driver.findElement(By.name("DateOfBirthMonth"));
			Select selectMonth = new Select(dateOfMonth);
			selectMonth.selectByVisibleText("December");

			WebElement dateOfYear = driver.findElement(By.name("DateOfBirthYear"));
			Select selectYear = new Select(dateOfYear);
			selectYear.selectByVisibleText("1988");

			WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys("zane5@yahoo.com");

			WebElement companyName = driver.findElement(By.id("Company"));
			companyName.sendKeys("Tech-Tac");

			WebElement newsLettCheck = driver.findElement(By.id("Newsletter"));
			newsLettCheck.click();

			WebElement passWord = driver.findElement(By.id("Password"));
			passWord.sendKeys("abcd1234");

			WebElement repassWord = driver.findElement(By.id("ConfirmPassword"));
			repassWord.sendKeys("abcd1234");

			Thread.sleep(2000);

			WebElement clickSubmit = driver.findElement(By.id("register-button"));
			clickSubmit.click();

			WebElement message = driver.findElement(By.cssSelector(
					"body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.result"));
			String checkMessg = message.getText();
			
			if (checkMessg.equals("Your registration completed!!!")) {
				System.out.println("TestCase PASSED");
			}
			
			else {
				
				System.out.println("TestCase FAILED");
			}
		}

		tearDown();

	}

}
