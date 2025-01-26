package com.java.examples;

import java.util.Scanner;

public class PrimeNumUserInput {

	
	public static void main(String[] args) {
	       
//      Scanner scanner = new Scanner(System.in); // Create a Scanner object for user inpu  
//      System.out.print("Enter a number to check if it's prime: ");
//      int num = scanner.nextInt(); // Read the user's input
//
//       if (num <= 1) {
//   System.out.println(num + " is not a prime number.");
//   return ;
//     }
//
//boolean isPrime = true; // Assume the number is prime
//
//for (int i = 2; i <= num / 2; i++) { // Loop from 2 to num/2
//   if (num % i == 0) {
//       isPrime = false; // If divisible, it's not a prime
//       break;
//   }
//}
//
//if (isPrime) {
//   System.out.println(num + " is a prime number.");
//} else {
//   System.out.println(num + " is not a prime number.");
//}
//
//scanner.close(); // Close the scanner
		System.out.println("Enter the numbers:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime=true;
		if(num<=1) {
			System.out.println(num+"not prime numbers:");
		}
		
		for(int i =2; i<=num/2;i++) {
			if(num%i==0) {
			 isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num +"   is prime");
		}else {
			System.out.println(num +"  not prime");
		}
		
}

}
