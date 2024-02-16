package tutoring.session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import utils.Hooks;

public class Practice5 extends Hooks {
	
		public static void main(String[] args) {

		setUp();

		driver.get("https://www.amazon.com.tr/");

		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("Selenium in Java");

		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		btnSearch.click();

		List<WebElement> itemList = driver.findElements(By.xpath(
				"//span[@class ='a-price-whole']"));
		
		double total=0;
		for (WebElement items : itemList) {

			
			String itemStr = items.getText().replace(".", "");
			
			Double sum =Double.valueOf(itemStr);

			
			total = total+sum;
			
			
		}
		System.out.println(total);
		tearDown();

	}

}
