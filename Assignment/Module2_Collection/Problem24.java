package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to increase the size of an array list. */ 

public class Problem24 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1.size());
		a1.ensureCapacity(6);
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1.size());
	}
}
