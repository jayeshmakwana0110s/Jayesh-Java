package com.exception_module2;

import java.util.Scanner;

/* 
W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid
*/
public class Program6 {
	public static void vote(int a)
	{
		if(a>=18)
		{
			System.out.println("Welcome to vote");
		}
		else
		{
			 throw new  ArithmeticException("not valid");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int a = sc.nextInt();
		vote(a);
		sc.close();
	}
}
