package com.java.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementInArray {
public static void main(String[] args) {
		
		//By using foor loop
		Integer[] array1 = {2,3,45,5,};
		Integer[] array2 = {2,4,6,8,9,3,45};
//		List<Integer> commonElement = new ArrayList();
//		for(int i = 0;i<array1.length;i++) {
//		for(int j = 0; j<array2.length;j++) {
//		if(array1[i] ==array2[j]) {
//			commonElement.add(array1[i]);
//			
//		}}}
//		System.out.println(commonElement);
		//2 by using collection
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
		ArrayList<Integer> list2 = new ArrayList<> (Arrays.asList(array2));
		list2.retainAll(list1);
		System.out.println(list2);
		
		// 3  by using Stream
	}
}



