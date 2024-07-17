package com.string_module2;

/* Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type */
class PrintNumber{
	public void printn(int a)
	{
		System.out.println("Int value is :" + a);
	}
	public void printn(long a)
	{
		System.out.println("Long value is :" + a);
	}
	public void printn(double a)
	{
		System.out.println("double value is :" + a);
	}
	public void printn(float a)
	{
		System.out.println("Float value is :" + a);
	}
	public void printn(byte a)
	{
		System.out.println("Byte value is :" + a);
	}
	
}
public class Problem12 {
	public static void main(String[] args) {
		PrintNumber a = new PrintNumber();
		a.printn(10);
		a.printn(1010101010l);
		a.printn(15.20d);
		a.printn(56.55f);
		a.printn((byte)128);
	}
}
