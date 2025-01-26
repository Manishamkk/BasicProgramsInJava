package com.java.examples;

public class PalindromeNum {
public static void main(String[] args) {
		
		int num =121;
		int rem ;
		int rev = 0;
		int temp = num;
		while(num>0) {
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		System.out.println("the given number is reversed:"+rev);
		if(temp==rev) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("not palindrome  number");
		}
	}
}
