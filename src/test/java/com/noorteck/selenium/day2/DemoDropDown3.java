package com.noorteck.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DemoDropDown3 extends Hooks {

	public static void main(String[] args) {
		
		setUp();
		
		driver.get("https://www.ebay.com/");
		
		WebElement selectItem = driver.findElement(By.name("_sacat"));

		Select selectObj = new Select(selectItem);
		
		List<WebElement> itemList = selectObj.getOptions();
		
		for (WebElement items : itemList) {

			String itemStr = items.getText();

			if (itemStr.contains("&")) {
				System.out.println(itemStr);	
				items.click();
				
			}
		}
		
		
		tearDown();

	}

}
