package com.exception_module2;

 /*
W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes
*/

@SuppressWarnings("serial")
class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException()
	{
		super("Age is not within the valid range of 15 to 21");
	}
}

@SuppressWarnings("serial")
class NameNotValidException extends Exception {
    public NameNotValidException() {
        super("Name contains numbers or special symbols");
    }
}

class Student
{
	int rollno;
	String name;
	int age;
	String course;
	
	public Student(int rollno, String name, int age, String course)  throws AgeNotWithinRangeException,NameNotValidException
	{
		this.rollno = rollno;
		
		if(!name.matches("[A-Za-z]+"))
		{
			throw new NameNotValidException();
		}
		this.name = name;
		
		if(age<15 || age>21)
		{
			throw new AgeNotWithinRangeException();
		}
		this.age = age;
		this.course = course;
	}
	
	public void getValue()
	{
		System.out.println("Roll no : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Course : " + course);
	}
}
public class Program8 {
	public static void main(String[] args) {
		try 
		{
			Student s1 = new Student(1,"Jayesh",21,"B.tech");
			s1.getValue();
		} 
		catch (NameNotValidException e) 
		{
			e.printStackTrace();
		}
		catch(AgeNotWithinRangeException e)
		{
			e.printStackTrace();
		}
	}
}
