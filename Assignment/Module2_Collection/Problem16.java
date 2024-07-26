package com.collection_module2;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collection;

/* Write a Java program to reverse elements in an array list.
 */
public class Problem16 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(60);
		a1.add(25);
		a1.add(80);
		a1.add(75);
		System.out.println("Original : " + a1);
		
		Collections.reverse(a1);
		
		System.out.println("Reverse : " + a1);
	}
}
