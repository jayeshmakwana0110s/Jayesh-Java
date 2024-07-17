package com.string_module2;

//Write a Java program to print the ASCII value of a given character

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int c = (int)a;
		System.out.println("The ASCII value of given charectore is  : " + c);
		sc.close();
	}
}
