package com.noorteck.selenium.day1;

import utils.Hooks;

public class Demo3 extends Hooks {

	public static void main(String[] args) {

		setUp();

		driver.get("https://www.expedia.com");

		tearDown();
	}

}
