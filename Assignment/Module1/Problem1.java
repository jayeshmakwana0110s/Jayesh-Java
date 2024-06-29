package com.module1;

import java.util.Scanner;

//Write a Java program to Take three numbers from the user and print the greatest number.

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //To get the user input
		System.out.println("Enter the 1st number : ");
		int a = sc.nextInt(); //Method of scanner class
		System.out.println("Enter the 2nd number : ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd number : ");
		int c = sc.nextInt();
		if((a>b) & (a>c))
		{
			System.out.println("1st number is greater..");
		}
		else if((b>a) & (b>c))
		{
			System.out.println("2nd number is greater..");
		}
		else
		{
			System.out.println("3rd number is greater..");
		}
		sc.close();
	}
}
