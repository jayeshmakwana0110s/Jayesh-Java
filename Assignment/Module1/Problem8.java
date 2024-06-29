package com.module1;

import java.util.Scanner;

/* Write a Java program that reads a positive integer and count the number of digits
the number.
Input an integer number less than ten billion: 125463
Number of digits in the number: 6
*/
public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer : ");
		int a = sc.nextInt();
		if(a>0)
		{
			int i = 0;
			while(a!=0)
			{
				i++;
				a = a/10;
			}
			System.out.print("Number of digit in the number : " + i);
		}
		else
		{
			System.out.println("Enter the positive integer number !!");
		}
		sc.close();
	}
}
