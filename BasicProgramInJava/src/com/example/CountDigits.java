package com.example;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
    
   System.out.println("Enter the number");
    int num = scanner.nextInt();
    
    int count = 0;
    int temp = Math.abs(num); // Handle negative numbers
    
    if (temp == 0) {
        count = 1; // Special case for 0
    } else {
        while (temp > 0) {
            temp /= 10; // Remove the last digit
            count++;
        }
    }
    
    System.out.println("Number of digits: " + count);
    scanner.close();
}
}