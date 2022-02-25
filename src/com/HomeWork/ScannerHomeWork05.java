package com.HomeWork;

import java.util.Scanner;

public class ScannerHomeWork05 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("How many years have you worked?");
	int Yw=input.nextInt();
	System.out.println("What is your annual salary?");
	int Sa=input.nextInt();
	if (Yw>=5) {
		System.out.println("You are eligible for for the bonus");
	}else {
		System.out.println("You are not eligible for the bonus");
	}	if (Sa>50000) {
		System.out.println("You will recieve a $5000 bonus");
	}	else {
		System.out.println("you will recieve a $3000 bonus");
	}
	
}
}
