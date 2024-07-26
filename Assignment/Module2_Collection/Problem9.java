package com.collection_module2;

/* • Write a Java program to copy one array list into another. */
import java.util.ArrayList;

public class Problem9 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println("List : " + a1);
		
		ArrayList<Integer> a2 = a1;
		
		System.out.println("List2 : " + a2);
	}
}
