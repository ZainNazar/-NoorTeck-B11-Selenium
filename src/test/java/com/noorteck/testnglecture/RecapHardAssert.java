package com.noorteck.testnglecture;

import org.testng.Assert;

public class RecapHardAssert {

	public static void main(String[] args) {
		
		
		double price1 = 22.2;
		double price2 = 34.4;

		Assert.assertTrue(price1 < price2);	
		
		System.out.println("Done...");
		
	}

}
