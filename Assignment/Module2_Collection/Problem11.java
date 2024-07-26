package com.collection_module2;

/* Write a Java program to append the specified element to the end of a hash set. */
//import java.util.HashSet;
import java.util.LinkedHashSet;

public class Problem11 {
	public static void main(String[] args) {
		LinkedHashSet<String> lh1 = new LinkedHashSet<String>();
		lh1.add("Black");
		lh1.add("White");
		lh1.add("Blue");
		lh1.add("Red");
		lh1.add("Purple");
		System.out.println(lh1);
		
		//append last
		lh1.add("Orange");
		System.out.println(lh1);
	}
}
