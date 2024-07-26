package com.collection_module2;

import java.util.ArrayList;
import java.util.HashSet;

/* • Write a Java program to convert a hash set to a List/Array List */
public class Problem22 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(80);
		h1.add(30);
		h1.add(70);
		h1.add(20);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(h1);
		System.out.println(a1);
	}
}
 