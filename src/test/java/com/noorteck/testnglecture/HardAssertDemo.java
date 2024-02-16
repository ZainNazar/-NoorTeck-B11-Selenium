package com.noorteck.testnglecture;

import org.testng.Assert;

public class HardAssertDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;

		Assert.assertEquals(a, b);

		String s1 = "Java";
		String s2 = "SQL";

		Assert.assertEquals(s1, s2);

		char option1 = 'A';
		char option2 = 'C';

		Assert.assertEquals(option1, option2);

		double price1 = 22.2;
		double price2 = 34.4;

		Assert.assertTrue(price1 < price2);	
	
	}
}
