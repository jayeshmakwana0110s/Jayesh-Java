package com.module2;

import java.util.Scanner;

/* We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods. */
abstract class Shape{
	abstract public void rectangleArea();
	abstract public void squareArea();
	abstract public void circleArea();
}

class Area2 extends Shape{

	int length;
	int breadth;
	int radius;
	int side;
	public Area2(int a, int b, int c, int d)
	{
		length = a;
		breadth = b;
		radius = c;
		side = d;
	}
	@Override
	public void rectangleArea() {
		int a = length * breadth;
		System.out.println("The area of the rectangle is : " + a);
	}

	@Override
	public void squareArea() {
		int a = side*side;
		System.out.println("The area of the square is : " + a);
	}

	@Override
	public void circleArea() {
		double a = Math.PI *radius*radius;
		System.out.println("The area of the square is : " + a);
	}
	
}
public class Program17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length, breadth, radius, side concurrently : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		Area2 a2 = new Area2(a,b,c,d);
		a2.circleArea();
		a2.rectangleArea();
		a2.squareArea();
		sc.close();
	}
}
