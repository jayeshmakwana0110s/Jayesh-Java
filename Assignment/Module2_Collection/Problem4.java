package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to retrieve an element (at a spec. index) from a given array list.
 */
public class Problem4 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		//Retrive elemts in specific index
		System.out.println(a1.get(3));
	}
}
