package com.module2;

import java.util.Scanner;

/* Write a program to print the factorial of a number by defining a method named
'Factorial'. */
class FactorialNum{
	public int Factorial(int a)
	{
		int fact = 1;
		for(int i = 1; i<=a; i++)
		{
			fact = fact*i;
		}
		return fact;
	}
}
public class Problem16 {
	public static void main(String[] args) {
		FactorialNum n1 = new FactorialNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find the fractional : ");
		int b = sc.nextInt();
		int a = n1.Factorial(b);
		System.out.println("The fraction of entered number is :  " + a);
		sc.close();
	}
}
