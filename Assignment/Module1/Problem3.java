package com.module1;

import java.util.Scanner;

/* Write a Java program that takes a year from user and print whether that year is a leap
year or not. */
public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int a = sc.nextInt();
		if((a%4) == 0)
			System.out.println("The year is leap year !! "); //is number of instruction is 1 don't near to add brackets..
		else
			System.out.println("The year is not a leap year !! ");
		sc.close();
	}
}
