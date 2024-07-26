package com.collection_module2;

import java.util.HashMap;

/* • Write a Java program to count the number of key-value (size) mappings in a map */
public class Problem15 {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Rahul");
		h1.put(2, "Jayesh");
		h1.put(3, "Shobha");
		h1.put(4, "Paresh");
		System.out.println(h1);
		System.out.println("Size : " + h1.size());
	}
}
