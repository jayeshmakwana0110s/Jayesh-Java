package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to print all the elements of an Array List using the position of
the elements. */
public class Problem26 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		for(int i = 0; i<a1.size() ; i++)
		{
			System.out.println(a1.get(i));
		}
	}
}
