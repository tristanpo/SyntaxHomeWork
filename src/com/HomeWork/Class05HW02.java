package com.HomeWork;

import java.util.Scanner;

public class Class05HW02 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("What day is it? Please use 1-7");
	int day=input.nextInt();
	
	if (day==1||day==2||day==3||day==4||day==5) {
		System.out.println("It is a weekday");
	}else if (day==6||day==7) {
		System.out.println("It is a weekend");
	}else {
		System.out.println("Invalid day");
	}
		
	}
}

