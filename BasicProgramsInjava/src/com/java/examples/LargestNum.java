package com.java.examples;

public class LargestNum {

	public static void main(String[] args) {
		int num1 = 10 ;
		int num2 = 20;
		int num3 = 30;//10,20,30
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1 + "largest number");
		}
		else if(num2>=num1 && num2>= num3) {
			System.out.println(num2 + " largest number");
		}
		else {
			System.out.println(num3 + "largest numbers");
		

		}
	}
}
