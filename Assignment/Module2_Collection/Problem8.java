package com.collection_module2;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

/* Write a Java program to sort a given array list. */
public class Problem8 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println("Unsorted list : " + a1);
		
		//Sorting 
		Collections.sort(a1);
		
		System.out.println("Sorted list : " + a1);
	}
}
