package com.multthreading_module2;

/* W.A.J. P to create one thread by extending Thread class in another Class. */
class Printa extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Number : " + i);
		}
		System.out.println("Completed : ");
	}
}
public class Problem2 {
	public static void main(String[] args) {
		Printa p1 = new Printa();
		p1.start();
	}
}
