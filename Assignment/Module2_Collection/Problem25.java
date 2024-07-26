package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to replace the second element of an Array List with the
specified element. */
public class Problem25 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		a1.set(2, 90);
		System.out.println(a1);
	}
}
