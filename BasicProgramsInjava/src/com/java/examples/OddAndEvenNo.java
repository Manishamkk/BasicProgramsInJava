package com.java.examples;

import java.util.Scanner;

public class OddAndEvenNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  numbers:");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("even numbers");
		}else {
			System.out.println("odd numbers");
		}
	}
}
