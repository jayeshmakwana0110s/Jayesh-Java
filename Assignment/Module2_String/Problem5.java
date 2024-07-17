package com.string_module2;

import java.util.Scanner;

/* W.A.J.P to get the character at the given index within the String. Original String =
Tops Technologies! The character at position 0 is T, The character at position 10 is
o
 */
public class Problem5 {
	public static void main(String[] args) {
		String a = new String("Tops Technologi");
		System.out.println("Enter the index : ");
		Scanner sc = new Scanner(System.in);	
		int b = sc.nextInt();
		System.out.println(a.charAt(b));
		sc.close();
	}
}
