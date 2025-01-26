package com.java.examples;

public class Factorial {

	public static void main(String[] args) {
		//	Scanner sc = new Scanner(System.in);
		//	System.out.println("Enter the number:");
				//int num = sc.nextInt();
			int num = 4;
				int fact= 1;
			for(int i = 1;i<=num;i++) {
				fact = fact*i;
			}
			System.out.println("the factorial of given number is:" +fact);	
			
		}
}
