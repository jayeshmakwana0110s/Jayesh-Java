package com.module2;

import java.util.Scanner;

/*Write a java program to reverse a string and check that the string is palindrome or
not*/
public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String a = sc.next();
		char[] b = a.toCharArray();
		char[] c = new char[b.length];
		
		//Reverse of array
		int d = b.length -1;
		for(int i=0; i<b.length; i++)
		{
			c[i] = b[d];
			d = d - 1;
		}
		
		int p = 0;
		for(int i=0; i<b.length; i++)
		{
			if(b[i] == c[p])
			{
				p++;
			}
			else
			{
				System.out.println("Not Palindrome !!");
				System.exit(0);
			}
		}
		System.out.println("Palindrome.. ");

		sc.close();
	}
}
