package com.collection_module2;

import java.util.ArrayList;
import java.util.Collections;

public class Problem10 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println("List : " + a1);
		
		//shuffle
		Collections.shuffle(a1);
		
		System.out.println("After shuffel : " + a1);
	}
}
