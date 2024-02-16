package tutoring.session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import utils.Hooks;

public class Practice4 extends Hooks {
	static int i=0;

	public static void main(String[] args) {

		setUp();

		driver.get("https://www.amazon.com/");

		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("Selenium in Java");

		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		btnSearch.click();

		List<WebElement> itemList = driver.findElements(By.xpath(
				"//span[@class ='a-size-medium a-color-base a-text-normal']"));
		
		
		for (WebElement items : itemList) {

			
			String itemStr = items.getText();
			
i++;
			System.out.println(itemStr);
			System.out.println("*************");
		}
		System.out.println(i);
		tearDown();

	}

}
