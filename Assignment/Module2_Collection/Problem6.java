package com.collection_module2;

import java.util.ArrayList;

/* • Write a Java program to remove the third element from an array list */
public class Problem6 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		//Removing 3rd elemnt from the array list
		a1.remove(2);
		System.out.println(a1);
	}
}
