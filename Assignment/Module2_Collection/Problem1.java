package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to create a new array list, add some
colors (string) and print out the collection. */
public class Problem1 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		//Adding elements
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Gray");
		a1.add("Green");
		
		//Printout the collection
		System.out.println(a1);
	}
}
