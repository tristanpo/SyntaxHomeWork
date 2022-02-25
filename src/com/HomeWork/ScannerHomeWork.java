package com.HomeWork;

import java.util.Scanner;

public class ScannerHomeWork {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("What loan amount do you need?");
int loan=input.nextInt();
if (loan<=200000) {
	System.out.println("You will recieve the loan");
}else {
	System.out.println("You will not recieve the loan");
}
	}

}
