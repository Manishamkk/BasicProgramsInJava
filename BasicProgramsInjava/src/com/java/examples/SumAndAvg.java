package com.java.examples;

import java.util.Scanner;

public class SumAndAvg {

	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  double num1 =0;
		  double num2=0;
		  double sum=0.0;
		  double avg=0.0;
		  
		  System.out.println("Enter the two number:");
		  num1=sc.nextDouble();
		  num2 =sc.nextDouble();
		  sum = num1 + num2;
		  avg = sum/2;
		  System.out.println("Sum of two numbers is:"+sum);
		  System.out.println("Average of two numbers is:"+avg);
		}
	
}
