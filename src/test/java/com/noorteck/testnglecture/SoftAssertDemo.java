package com.noorteck.testnglecture;

import org.testng.asserts.SoftAssert;

public class SoftAssertDemo { // get it from testng

	public static void main(String[] args) {

		SoftAssert SAObj = new SoftAssert();
		int a = 10;
		int b = 20;

		SAObj.assertEquals(a, b);

		String s1 = "Java";
		String s2 = "SQL";

		SAObj.assertEquals(s1, s2);

		char option1 = 'A';
		char option2 = 'C';

		SAObj.assertEquals(option1, option2);

		double price1 = 22.2;
		double price2 = 34.4;
		SAObj.assertEquals(price1, price2);
		SAObj.assertAll();

	}

}
