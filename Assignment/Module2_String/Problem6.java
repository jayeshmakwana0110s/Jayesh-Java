package com.string_module2;
 /* W.A.J.P to concatenate a given string to the end of another string. */

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = new String("Hello ");
		System.out.println("Enter the String : " );
		String b = sc.nextLine();
		String c = a.concat(b);
		System.out.println("The new string is : " + c );
		sc.close();
	}
}
