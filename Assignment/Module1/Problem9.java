package com.module1;

public class Problem9 {
	public static void main(String[] args) {
		System.out.println("Here the list in which number is divisible by both..");
		for(int i=1; i<=100; i++)
		{
			if((i%3 == 0) && (i%5 == 0))
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("Here the list in which number is divisible by 3..");
		for(int i=1; i<=100; i++)
		{
			if((i%3 == 0) && (i%5 == 0))
			{
				continue;
			}
			else if(i%3 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("Here the list in which number is divisible by 5..");
		for(int i=1; i<=100; i++)
		{
			if((i%3 == 0) && (i%5 == 0))
			{
				continue;
			}
			else if(i%5 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
