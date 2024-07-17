package com.module2;

/* Print the sum, difference and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user.  */
import java.util.Scanner;

class Complex
{
	int freal;
	int fimage;
	int sreal;
	int simage;
	public Complex(int a,int b, int c, int d) {
		freal = a;
		fimage = b;
		sreal = c;
		simage = d;
	}
	
	public void addition ()
	{
		int a = freal + sreal;
		int b = fimage + simage; 
		System.out.println("The sum of enterd complex number is : ");
		System.out.println(a + "+" + b + "i");
	}
	
	public void substraction()
	{
		int a = freal - sreal;
		int b = fimage - simage;
		System.out.println("The substraction of enterd complex number is : ");
		System.out.println(a + "+" + b + "i");
	}
	
	public void multiplication()
	{
		int a = freal*sreal;
		int b = (freal*simage) + (fimage*sreal) - (fimage*simage);
		System.out.println("The multiplication of enterd complex number is : ");
		System.out.println(a + "+" + b + "i");
	}
}
public class Problem12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real and image part concorrently for first number : ");
		int real1 =sc.nextInt();
		int image1 =sc.nextInt();
		System.out.println("You have enter first complex number is : ");
		System.out.println(real1 + "+" +image1 + "i");
		
		System.out.println("Enter the real and image part concorrently for secound number : ");
		int real2 =sc.nextInt();
		int image2 =sc.nextInt();
		System.out.println("You have enter secound complex number is : ");
		System.out.println(real1 + "+" +image1 + "i");
		
		Complex c1 = new Complex(real1,image1,real2,image2);
		c1.addition();
		c1.substraction();
		sc.close();
	}
}
