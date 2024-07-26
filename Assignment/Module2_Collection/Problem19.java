package com.collection_module2;

import java.util.ArrayList;
import java.util.Collections;

/* Write a Java program of swap two elements in an array list */
public class Problem19 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		//swap
		Collections.swap(a1, 2, 3);
		
		System.out.println(a1);
	}
}
