package com.noorteck.testnglecture;

public class Recap2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a == b) {

			System.out.println("Equals");
		} else
			System.out.println("Not Equals");

		String s1 = "Java";
		String s2 = "SQL";

		if (s1.equals(s2)) {

			System.out.println("Equals");
		} else
			System.out.println("Not Equals");

		char option1 = 'A';
		char option2 = 'C';

		if (option1 == option2) {

			System.out.println("Equals");
		} else
			System.out.println("Not Equals");

		double price1 = 22.2;
		double price2 = 34.4;

		if (price1 < price2) {

			System.out.println("less than....");
		} else
			System.out.println("not less than....");
	}
}
