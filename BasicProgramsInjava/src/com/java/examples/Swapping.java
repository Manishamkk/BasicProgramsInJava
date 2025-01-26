package com.java.examples;

public class Swapping {
	public static void main(String[] args) {

//	    int a = 100;
//	    int b = 200;
//	    System.out.println("Before the Swapping a : "+a + "and b:" + b );
//		int temp = a;   //temp=100
//		a =b ;//a=200
//		b = temp;//b=100
//		System.out.println("After the Swapping of two numbers by using third variables: value a: "+
//				a+ " and value of b :" + b);
		//swapping of two variables
//		int a = 10;
//		int b = 20;
//		System.out.println("Before the swapping a:" + a + "and b :"+ b);
//		a = a+b; //a = 30
//		b = a-b; //b = 10
//		a = a-b;// a = 20
//		System.out.println("After the two numbers swapping vaule is a :" + a + "and b :" + b);
	//	
		
			//Swapping two numbers by using XOR OPerators
			int a = 20;
			int b = 5;
			System.out.println("Before the SWapping value of a: "+a + "and b :" + b);
			a = a^b;  //20/5   a =4
			b = a^b;//
			a = a^b ;
			System.out.println("After the Swapping two numbers  value of a:" + a + " and b :" + b);
			
			
		}
			
}
