package com.string_module2;

import java.util.Scanner;

/*  W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
 */
public class Problem7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1 : ");
		String a = sc.nextLine();
		System.out.println("Enter string 2 : ");
		String b = sc.nextLine();
		if(a.equals(b)) 
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
