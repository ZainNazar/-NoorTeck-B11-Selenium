package tutoring.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Practice2 extends Hooks {

	public static void main(String[] args) {
		setUp();

		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement submit = driver.findElement(By.name("submit"));
		
		submit.click();

		WebElement textC = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));

	String text = textC.getText();
	
	System.out.println(text);
		
		tearDown();

	}

}
