package com.module2;
 
/* Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class */
class Parent
{
	public void parentPrint()
	{
		System.out.println("This is a parent class");
	}
}

class Child extends Parent
{
	public void childPrint()
	{
		System.out.println("This is a child class");
	}
}

public class Problem8 {
	public static void main(String[] args) {
		System.out.println("1");
		Parent p1 = new Parent();
		p1.parentPrint();
		
		Child c1 = new Child();
		System.out.println("2");
		c1.childPrint();
		System.out.println("3");
		c1.parentPrint();
		
	}
}
