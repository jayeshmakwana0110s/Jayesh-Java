package com.module2;
/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members. */
class Member
{
	int datamember;
	String name;
	int age;
	long pnumber;
	String address;
	int salary;
	
	public Member(int a, String b,int c,long d,String e,int f)
	{
		this.datamember = a;
		this.name = b;
		this.age = c;
		this.pnumber = d;
		this.address = e;
		this.salary = f;
	}
	
	public void printSalary()
	{
		System.out.println("The salary of member " + this.datamember + " is : " + this.salary);
	}
}
public class Problem9 {
	 public static void main(String[] args) {
		Member m1 = new Member(1,"jayesh",20,20202020,"surat",50000);
		m1.printSalary();
		Member m2 = new Member(2,"Krish",20,20202020,"ahmedabad",70000);
		m2.printSalary();
	}
}
