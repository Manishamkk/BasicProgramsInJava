package com.java.examples;

public class ArmstrongNum {

public static void main(String[] args) {
	
	int sum = 0 , res ,temp ;
	int  num = 153 ;
	temp = num;
	while(num>0) {
		res = num% 10;
        num = num/ 10;
        sum = sum + (res*res*res);
	}
	if(temp == sum) {
		System.out.println("Armstrong number:"+sum);
	}
	else {
		System.out.println("Not armstrong number");
	}
}	
}
