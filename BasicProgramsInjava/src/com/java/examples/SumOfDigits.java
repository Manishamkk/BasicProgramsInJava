package com.java.examples;

public class SumOfDigits {
	public static void main(String[] args) {
	     int num =643212969;
	     int sum = 0;
	     int count = 0;
	     while(num!=0) {
	    	 sum = sum+num%10;
	    	 num  = num/10;
	    	 count++;
	     }
	     System.out.println("sum of numbers:"+sum);
	     System.out.println("count of numbers:" + count);
	}

}
