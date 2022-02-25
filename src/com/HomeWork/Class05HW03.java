package com.HomeWork;

import java.util.Scanner;

public class Class05HW03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=input.nextInt();
		
		if (num<=10) {
			System.out.println("Number is small");
		}else if (num>=11 && num<=100) {
			System.out.println("Number is medium");
		}else if (num>=101 && num<=1000) {
			System.out.println("Number is large");
		

	}
	}
}
