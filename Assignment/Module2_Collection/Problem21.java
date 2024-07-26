package com.collection_module2;

import java.util.HashSet;

/* Write a Java program to convert a hash set to an array */

public class Problem21 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(80);
		h1.add(30);
		h1.add(70);
		h1.add(20);
		
		Integer[] a = new Integer[h1.size()];
		h1.toArray(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
