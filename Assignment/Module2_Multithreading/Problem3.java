package com.multthreading_module2;

class A extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try {
				A.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Class A : " + i);
		}
		System.out.println("Done");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try {
				B.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Class B : " + i);
		}
		System.out.println("Done");
	}
}
public class Problem3 {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		b1.start();
		a1.start();
	}
}
