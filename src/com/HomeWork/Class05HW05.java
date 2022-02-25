package com.HomeWork;

import java.util.Scanner;

public class Class05HW05 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What are your quiz, midterm, and final grades?");
		int quiz=input.nextInt();
		int	mid=input.nextInt();
		int fin=input.nextInt();
		
		if ((quiz+mid+fin)/3==90) {
			System.out.println("You have A");
		}else if ((quiz+mid+fin)/3>=70||(quiz+mid+fin)/3>=90) {
			System.out.println("You have B");
		}else if ((quiz+mid+fin)/3>=50||(quiz+mid+fin)/3>=70) {
			System.out.println("You have C");
		}else if ((quiz+mid+fin)/3<50) {
			System.out.println("you have F");
		}
	}

}
