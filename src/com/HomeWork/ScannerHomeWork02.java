package com.HomeWork;

import java.util.Scanner;

public class ScannerHomeWork02 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("How old are you?");
	int age=input.nextInt();
	if (age>=18) {
		System.out.println("You are eligible for a driver license");
	}else {
		System.out.println("You may recieve a learners permit");
	}
}
}
