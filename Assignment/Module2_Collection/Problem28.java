package com.collection_module2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* Write a Java program to get a collection view of the values contained in this map. */
public class Problem28 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 7);
        
        Collection<Integer> values = map.values();
        
        System.out.println("Values in the map: " + values);
	}
}
