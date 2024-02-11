package a.homework.one;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class ExerciseSixx extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		String title = driver.getTitle();
		Thread.sleep(2000);
		if (title.equals("Alerts")) {

			WebElement alertBtn = driver.findElement(By.linkText("Alert with Textbox"));
			alertBtn.click();

			WebElement buttnDemo = driver.findElement(By.cssSelector("#Textbox > button"));
			buttnDemo.click();

			Alert altTest = driver.switchTo().alert();
			altTest.sendKeys("Zain");
			Thread.sleep(2000);
			altTest.accept();

			WebElement verifryMessage = driver.findElement(By.id("demo1"));
			String text = verifryMessage.getText();
			
			if (text.contains("How are you today")) {

				System.out.println("Verified");

				WebElement okAndCancleBtn = driver
						.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
				okAndCancleBtn.click();
				Thread.sleep(800);
				
				WebElement displayAlert = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
				displayAlert.click();
				Thread.sleep(800);
				
				Alert demoAlert= driver.switchTo().alert();
				String demoAL =demoAlert.getText();
				if (demoAL.equals("Press a Button !")) {
					
					demoAlert.dismiss();
				}
				
				else {
					demoAlert.accept();
				}
				
				WebElement textP = driver.findElement(By.id("demo"));
				String text2 =textP.getText();
				
				if (text2.contains("You Pressed")) {
					System.out.println("Verified it's Contains You Pressed");
				}
				
			}
		}

		tearDown();

	}

}
