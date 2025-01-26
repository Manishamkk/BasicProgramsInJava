package com.java.examples;

public class PrimeNum {

	//public static void main(String[] args) {
//  	  Scanner sc = new Scanner(System.in);
//  	  System.out.println("Enter the numbers:");
//  	  int count = 0;
//  	  int num = sc.nextInt();
//  	  if(num<=1) {
//  		  System.out.println("number is not prime bumbers");
//  	  }
//  	  for(int i = 2;i<=num;i++) {
//  		  if(num%i==0) {
//  			  count++;
//  			  break;
//  		  }
//  	  }
//  	  if(count==0) {
//  		  System.out.println(num+"prime numbers");
//  	  }else {
//  		  System.out.println(num+"not prime numbers");
//  	  }
	
	


		
//		    public static void main(String[] args) {
//		        int num = 30; // Change this to test with other numbers
//		    	int count = 0;
//		        if (num <= 1) {
//		            System.out.println(num+"The number is not a prime number.");
//		            return;
//		        }
//
//		        for (int i = 2; i<=num/2; i++) { // Loop up to num/2 for efficiency
//		            if (num % i == 0) {
//		                count++;
//		                break; // No need to check further if a divisor is found
//		            }
//		        }
//
//		        if (count == 0) {
//		            System.out.println(num + " is a Prime Number.");
//		        } else {
//		            System.out.println(num + " is not a Prime Number.");
//		        }
//		    }

	public static void main(String[] args) {
	int num = 21;
	int count = 0;
	if(num<=1) {
		System.out.println("not prime numbers:");
	}
	for(int i = 2;i<=num/2;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count>1) {
		System.out.println(num+"prime num");
	}
	else {
		System.out.println("not prime umbers");
	}
		
}

  	  
    }
	

