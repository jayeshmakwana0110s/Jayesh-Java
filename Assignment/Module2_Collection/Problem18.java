package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to compare two array lists. */

public class Problem18 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		
		if(a1.equals(a2))
		{
			System.out.println("Same...");
		}
		else
		{
			System.out.println("Not same..");
		}
	}
}
