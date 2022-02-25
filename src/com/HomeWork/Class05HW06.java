package com.HomeWork;

import java.util.Scanner;

public class Class05HW06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What month were you born?");
		String month = input.next();

		if (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may")) {
			System.out.println("You were born in spring");
		} else if (month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july")
				|| month.equalsIgnoreCase("august")) {
			System.out.println("You were born in summer");
		}else if (month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october")
				|| month.equalsIgnoreCase("november")) {
			System.out.println("You were born in autumn");
		}else if (month.equalsIgnoreCase("december") || month.equalsIgnoreCase("january")
				|| month.equalsIgnoreCase("february")) {
			System.out.println("You were born in winter");
		}

	}

}
