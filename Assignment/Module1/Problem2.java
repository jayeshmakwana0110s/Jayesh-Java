package com.module1;

import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
message.*/
public class Problem2 
	{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the single character : ");
			String a = sc.next();
			if(a.length()>1)
			{
				System.out.println("Error");
				System.out.println("Please enter sngle charectore !!");
				System.exit(0); // It is the method to terminate the code 
			}
			char b = a.charAt(0);
			if((b>='a' && b<='z') || (b>='A' && b<='z'))
			{
				
				if(b == 'a'|| b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U')
				{
					System.out.println("It,s a vowel..");
					System.out.println(b);
				}
				else
				{
					System.out.println("It is a Consonant..");
					System.out.println(b);
				}
			}
			else
			{
				System.out.println("Please enter the letter..");
				System.out.println("Error");
			}
			sc.close();
		}

	}
