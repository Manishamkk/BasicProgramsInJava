package com.java.examples;

public class RemoveStringSpace {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the String:");
		//String input = sc.nextLine();
		String input = "Manisha Keshav Kadam";
		System.out.println(input);
		input = input.replaceAll("\\s", "");
		System.out.println(input);
	}
	
}
