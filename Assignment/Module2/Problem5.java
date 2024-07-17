package com.module2;

import java.util.Scanner;

/* Write a java program Find out length of string without using inbuilt function */

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String a = sc.nextLine();
		char[] b = a.toCharArray(); // used to convert the string into array
//		for(int i=0; i<b.length; i++)
//		{
//			System.out.print(b[i] + " ");
//		}
		System.out.println(b.length);
		sc.close();
	}
}
