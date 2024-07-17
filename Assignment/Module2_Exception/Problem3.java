package com.exception_module2;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elemnts : ");
		int[] a = new int[4];
		try {
			for(int i = 0; i<a.length; i++)
			{
				a[i] = sc.nextInt();
			}
			System.out.println("Enter the number which you want to divide with array element : ");
			int b = sc.nextInt();
			System.out.println("Enter the aray index you want to divide with entered number : ");
			int c = sc.nextInt();
			int d = a[c]/b;
			System.out.println("the division is : " + d);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		sc.close();
	}
}
