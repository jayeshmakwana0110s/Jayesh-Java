package com.collection_module2;

import java.util.ArrayList;

/* • Write a Java program to insert an element into the array list at the first position. */
public class Problem3 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		//Adding elemts in first in aarylist
		a1.add(0, 01);
		
		System.out.println(a1);
	}
}
