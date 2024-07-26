package com.collection_module2;

import java.util.ArrayList;
//import java.util.Collections;

/* Write a Java program to join two array lists. */ 

public class Problem20 {
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
		
		a2.addAll(a1);
		
		System.out.println(a2);
		
	}
}
