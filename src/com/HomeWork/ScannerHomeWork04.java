package com.HomeWork;

import java.util.Scanner;

public class ScannerHomeWork04 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Do you have a credit card?");
	String card=input.nextLine();
	
	if (card.equalsIgnoreCase("yes")) {
		System.out.println("What is the balance on the card?");
	}else {
		System.out.println("Would you like a credit card?");
	}
	int balance=input.nextInt();
	if (balance>1000) {
		System.out.println("Pay off the card immediately");
	}else {
		System.out.println("You can spend more");
	}
	
		
	
}
}
