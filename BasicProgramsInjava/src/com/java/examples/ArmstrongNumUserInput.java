package com.java.examples;

import java.util.Scanner;

public class ArmstrongNumUserInput {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the armstrong numbers:");
			num = sc.nextInt();
			  if (isArmstrong(num)) {
		            System.out.println(num + " is an Armstrong number.");
		        } else {
		            System.out.println(num + " is not an Armstrong number.");
		        }
	}

	private static boolean isArmstrong(int num) {
		// TODO Auto-generated method stub
		 int temp = num;
		 int res;
		 int sum = 0;
		 while(num>0) {
			 res = num%10;
			 sum = sum  + (res*res*res);
			 num = num/10;	 
		 }
		
		return temp == sum;
	}

	

}
