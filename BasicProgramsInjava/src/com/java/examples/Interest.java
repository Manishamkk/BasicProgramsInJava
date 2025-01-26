package com.java.examples;

import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		double principleAmmount=0.0;
		double rate =0.0;
		double time = 0.0;
		double interest =0.0;
	     Scanner sc = new Scanner(System.in) ;
	     System.out.println("Enter the principle ammount:");
	     principleAmmount =sc.nextDouble();
	     System.out.println("Enter the rate:");
	     rate = sc.nextDouble();
	    System.out.println("Enter the time :");
	    time = sc.nextDouble();
	    interest = principleAmmount*rate*time/100;
	    System.out.println("Simple interest is :"+interest);
	}
		
}
