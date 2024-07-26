package com.collection_module2;

import java.util.ArrayList;
import java.util.List;

/* Write a Java program to extract a portion of an array list */
public class Problem17 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(60);
		a1.add(25);
		a1.add(80);
		a1.add(75);
		System.out.println("Original : " + a1);
		
		List<Integer> a2 = a1.subList(2, 4);
		System.out.println(a2);
	}
}
