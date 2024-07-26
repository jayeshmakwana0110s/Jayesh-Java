package com.collection_module2;

import java.util.HashSet;
import java.util.Set;

/* Write a Java program to compare two sets and retain elements which are same on
both sets */
public class problem27 {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		System.out.println(s1);
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(50);
		s2.add(60);
		System.out.println(s2);
		
		s1.retainAll(s2);
		
		System.out.println(s1);
	}
}
