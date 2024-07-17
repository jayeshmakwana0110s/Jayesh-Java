package com.module2;

/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor. */
class Triangle
{
	int a = 3;
	int b = 4;
	int c = 5; 
	
	int s = (a+b+c)/2;
	
	int cal = (s*(s-a)*(s-b)*(s-c));
	
	public double squareRoot(int a)
	{
		double squareroot = a/2;
		double q;
		do {
			q = squareroot;
			squareroot = (q+(a/q))/2;
		}while((q-squareroot) != 0);
		return squareroot;
	} 
	
	double tarea = this.squareRoot(cal);
	
	public void area()
	{
		System.out.println("The area traingle is : " + this.tarea);
	}
}
public class Programe11 {
	public static void main(String[] args) {
		Triangle t1 =  new Triangle();
		t1.area();
	}
}
