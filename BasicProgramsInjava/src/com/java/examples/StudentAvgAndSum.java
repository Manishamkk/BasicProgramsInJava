package com.java.examples;

import java.util.Scanner;

public class StudentAvgAndSum {

	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int marks1 ,marks2,marks3,marks4;
		double total,avg,per;
		System.out.println("Enter the first subject marks:");
		 marks1 = sc.nextInt();
		System.out.println("Enter the second subject marks:");
		 marks2 = sc.nextInt();
		 System.out.println("Enter the third subject marks:");
		 marks3 = sc.nextInt();
		 System.out.println("Enter the forth subject marks:");
		 marks4 = sc.nextInt();
		 total = marks1+marks2+marks3+marks4;
		 avg = total/4;
		 per = total/100;
		 System.out.println(total);
		 System.out.println(avg);
		 System.out.println(per);
		 
		 
	}
}
