package com.collection_module2;

import java.util.HashSet;
import java.util.Iterator;

/* • Write a Java program to iterate through all elements in a hash list */
public class Problem12 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(88);
		h1.add(35);
		h1.add(32);
		h1.add(78);
		System.out.println(h1);
		
		//Iterate
		Iterator<Integer> i1 = h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
