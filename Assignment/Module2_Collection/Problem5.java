package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to update specific array element by given element. */
public class Problem5 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		//update specifice elemnt
		a1.set(2, 55);
		System.out.println(a1);
	}
}
