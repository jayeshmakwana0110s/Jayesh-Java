package com.collection_module2;

import java.util.ArrayList;
import java.util.Iterator;

public class Problem2 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		//Adding elements
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Gray");
		a1.add("Green");
		
		//Printout the collection
		Iterator<String> i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
