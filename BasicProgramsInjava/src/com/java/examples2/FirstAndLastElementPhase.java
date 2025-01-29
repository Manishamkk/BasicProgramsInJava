package com.java.examples2;

import java.util.ArrayList;

public class FirstAndLastElementPhase {

	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		//insertion order
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(4);
		
	int first = list.get(0);
	int last= list.get(list.size()-1);
	System.out.println("first element:" + first);
	System.out.println("last element : " + last);
	}
}
