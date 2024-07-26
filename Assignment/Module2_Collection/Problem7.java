package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to search an element in an array list. */

public class Problem7 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		//search elements
		if(a1.contains(20))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
