package com.collection_module2;

import java.util.HashMap;

/* Write a Java program to associate the specified value with the specified key in a
Hash Map */
public class Problem14 {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Rahul");
		h1.put(2, "Jayesh");
		h1.put(3, "Shobha");
		h1.put(4, "Paresh");
		System.out.println(h1);
	}
}
