package com.module2;
 /* Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
object of 'Square' class.
*/
class Shape2{
	public void shapeMethod()
	{
		System.out.println("This is this is shape");
	}
}
class Rectangle2 extends Shape2{
	public void shapeRectangel()
	{
		System.out.println("This is rectangular shape");
	}
}
class Circle2 extends Shape2{
	public void shapeCircle()
	{
		System.out.println("This is circular shape");
	}
}
class Square2 extends Rectangle2{
	public void shapeSquare()
	{
		System.out.println("Square is a rectangle");
	}
}
public class Programe19 {
	public static void main(String[] args) {
		Square2 s = new Square2();
		s.shapeRectangel();
		s.shapeMethod();
		
	}
}
