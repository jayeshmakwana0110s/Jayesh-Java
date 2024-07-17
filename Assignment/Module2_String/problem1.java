package com.string_module2;

import java.util.Scanner;

/* Write a Java program to count the letters, spaces, numbers and other characters of
an input string */
class Count{
	int letter = 0;
	int spaces = 0;
	int numbers = 0;
	int characters = 0;
	
	public void stringCount(char[] s)
	{
		for(int i=0; i<s.length; i++)
		{
			if(Character.isLetter(s[i]))//used for check the letter
			{
				letter++;
			}
			else if(Character.isDigit(s[i]))//used for check the digit
			{
				numbers++;
			}
			else if(Character.isSpaceChar(s[i]))//used for check the space
			{
				spaces++;
			}
		}
		System.out.println("Number of letter is : " + letter);
		System.out.println("Number of number is : " + numbers);
		System.out.println("Number of space is : " + spaces);
	}
}
public class problem1 {
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		char[] b = a.toCharArray();
		Count c = new Count();
		c.stringCount(b);
		sc.close();
	}
}
