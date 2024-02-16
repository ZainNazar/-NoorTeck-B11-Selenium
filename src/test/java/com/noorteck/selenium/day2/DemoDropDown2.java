package com.noorteck.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DemoDropDown2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement selectCountry = driver.findElement(By.name("country"));

		Select selectObj = new Select(selectCountry);

		// To Retrieve all the options from the country drop down

		List<WebElement> countryList = selectObj.getOptions();

		// We have to loop

		for (WebElement country : countryList) {

			String countrystr = country.getText();

			System.out.println(countrystr);

			if (countrystr.equals("SPAIN")) {

				country.click();
				break;
			}
		}

		tearDown();

	}

}
