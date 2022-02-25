package com.HomeWork;

import java.util.Scanner;

public class ScannerHomeWork03 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("What city do you live in?");
	String city=input.nextLine();
	System.out.println("What is the temperature in Fahrenheit?");
	double t=input.nextDouble();
	System.out.println("The temperature in the city is "+t+"F "+"and "+(t-32)*5/9+"C");
	
}
}
