package com.example;

import java.util.Scanner;

public class Student {

	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println("enter the age:");
		int age = sc.nextInt();
		sc.close();
	}
}
