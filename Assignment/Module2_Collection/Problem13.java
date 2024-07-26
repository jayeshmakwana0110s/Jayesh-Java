package com.collection_module2;

import java.util.HashSet;

/* Write a Java program to get the number of elements in a hash set. */
public class Problem13 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(88);
		h1.add(35);
		h1.add(32);
		h1.add(78);
		System.out.println(h1);
		
		System.out.println("Size : " + h1.size()) ;
	}
}
