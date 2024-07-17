package com.module2; /* Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
having a method with the same name 'message' that prints "This is first subclass"
and "This is second subclass" respectively. Call the methods 'message' by creating
an object for each subclass. */

abstract class Parent1{
	abstract public void message();
}

class Sub1 extends Parent1{

	@Override
	public void message() {
		System.out.println("This is first subclass..");
	}
	
}

class Sub2 extends Parent1{

	@Override
	public void message() {
		System.out.println("This is second subclass..");
	}
	
}
public class Problem13 {
	public static void main(String[] args) {
		Sub1 s1 = new Sub1();
		s1.message();
		Sub2 s2 = new Sub2();
		s2.message();
	}
}
