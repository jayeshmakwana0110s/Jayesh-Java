package com.module2;

import java.util.Scanner;

/* Write a java program to make addition, Subtraction and multiplication of two
matrix using 2-D Array */
public class Problem4 {
	
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st array element : ");
		for(int i = 0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the 2st array element : ");
		for(int i = 0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		int y = 1;
		while(y<=1)
		{
		System.out.println("Press 1 : addition");
		System.out.println("Press 2 : Substraction");
		System.out.println("Press 3 : Multiplication");
		
		int o = sc.nextInt();
		if(o == 1)
		{
			System.out.println("Addtion of matrix : ");
			int[][] c =new int[3][3];
			for(int i = 0; i<3; i++)
			{
				for(int j = 0; j<3; j++)
				{
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			
			for(int i = 0; i<3; i++)
			{
				for(int k = 0; k<3; k++)
				{
					System.out.print(c[i][k] + " ");
				}
				System.out.println();
			}
		}
		else if(o == 2)
		{
			System.out.println("subtraction of matrix : ");
			int[][] d =new int[3][3];
			for(int i = 0; i<3; i++)
			{
				for(int j = 0; j<3; j++)
				{
					d[i][j] = a[i][j] - b[i][j];
				}
			}
			
			for(int i = 0; i<3; i++)
			{
				for(int k = 0; k<3; k++)
				{
					System.out.print(d[i][k] + " ");
				}
				System.out.println();
			}
		}
		else if(o == 3)
		{

			System.out.println("Maultiplication of matrix : ");
			int[][] e =new int[3][3];
			for(int i = 0; i<3; i++) //Row
			{
				for(int j = 0; j<3; j++) //Coloum
				{
					e[i][j] = 0;
					for(int k = 0; k<3; k++) //shifting elements
					{
						e[i][j] = e[i][j] + (a[i][k] * b[k][j]);
					}
				}
			}
			
			for(int i = 0; i<3; i++)
			{
				for(int k = 0; k<3; k++)
				{
					System.out.print(e[i][k] + " ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Invalid Input !!");
		}
		
		}
		sc.close();
		
	}
}
