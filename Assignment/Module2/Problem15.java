package com.module2;

/* We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the
percentage of the students. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its parameters for student
B. Create an object for each of the two classes and print the percentage of marks for
both the students. */

abstract class Marks{
	abstract public int getPercentage();
}

class A extends Marks{
	int math;
	int science;
	int social_science;

	public A(int math,int science,int social_science){
		this.math = math;
		this.science = science;
		this.social_science = social_science;
	}
	@Override
	public int getPercentage() {
		int total = math + science + social_science;
		int percentage = total/3;
		return percentage;
	}
	
}

class B extends Marks{
	int math;
	int science;
	int social_science;
	int art;

	public B(int math, int science,int social_science,int art)
	{
		this.math = math;
		this.science = science;
		this.social_science = social_science;
		this.art = art;
	}
	@Override
	public int getPercentage() {
		int total = math + science + social_science + art;
		int percentage = total/4;
		return percentage;
	}
	
}
public class Problem15 {
 public static void main(String[] args) {
	A a1 = new A(90,90,90);
	B b1 = new B(90,90,90,90);
	int a = a1.getPercentage();
	System.out.println("Percentage obtain by student 1 is : " + a);
	int b = b1.getPercentage();
	System.out.println("Percentage obtain by student 2 is : " + b);
}
}
