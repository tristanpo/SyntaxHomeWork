package com.HomeWork;

import java.util.Scanner;

public class Class05HW04 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is the current time? Use 24 hour format");
		int time=input.nextInt();
		
		if (time>=1||time<=11) {
			System.out.println("It is morning");
		}else if (time>=12||time<=15) {
			System.out.println("It is afternoon");
		}else if (time>=16||time<=20) {
			System.out.println("It is evening");
		}else if (time>=21||time<=24) {
			System.out.println("It is night");
		}
	}

}
