package com.module2;

/* Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square. */

class Area
{
	public int Areaab(int length, int breath)
	{
		return length * breath;
	}
	
	public int Areaab(int length)
	{
		return length * length;
	}
}

public class Problem7 {
	public static void main(String[] args) {
		Area a = new Area();
		System.out.println("The area of rectangle is : " + a.Areaab(10, 20));
		System.out.println("The area of square is : " + a.Areaab(10));	
	}
}
