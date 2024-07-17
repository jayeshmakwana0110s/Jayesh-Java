package com.module2;

/* Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perameter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square. */

class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area()
	{
		System.out.println("Area of rectangle is : " + (length * breadth));
	}
	
	public void perameter()
	{
		System.out.println("The length of rectangle is : " + this.length);
		System.out.println("The braeth of rectangle is : " + this.breadth);
	}
}

class Square extends Rectangle
{
	int rlength;
	
	public Square(int rlength , int breadth)
	{
		super(rlength,breadth);
		this.rlength = rlength;
	}
	
	public void rarea()
	{
		System.out.println("Area of square is : " + (rlength * rlength));
	}
	
	public void rperameter()
	{
		System.out.println("The length of square is : " + this.rlength);
	}
}
public class Problem10 {
	public static void main(String[] args) {
		Square s1 = new Square(10,20);
		s1.rarea();
		s1.rperameter();
		s1.area();
		s1.perameter();
	}
}
