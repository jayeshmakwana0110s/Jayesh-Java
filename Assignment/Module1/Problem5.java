package com.module1;

import java.util.Scanner;

/*Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop.*/
public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter five numbers : ");
		for(int i=1; i<=5; i++)
		{
			System.out.println("Enter the " + i + " number : ");
			int j = sc.nextInt();
			sum = sum + j;
		}
		System.out.println("The sum of five number is : " + sum);
		int average = sum/5;
		System.out.println("The average of five number is : " + average);
		sc.close();
	}
}
