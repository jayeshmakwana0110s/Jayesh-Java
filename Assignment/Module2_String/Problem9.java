package com.string_module2;

import java.util.Scanner;

/* W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False */
public class Problem9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "Red is favorite color";
		System.out.println("Enter the start part of string : ");
		String st = sc.nextLine();
		if(a.startsWith(st))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		sc.close();
	}
}
