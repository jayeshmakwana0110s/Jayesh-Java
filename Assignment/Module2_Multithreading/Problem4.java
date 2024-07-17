package com.multthreading_module2;

/* W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); */

class ThreadTwice extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thread : " + i);
		}
	}
}
public class Problem4 {
	public static void main(String[] args) {
		ThreadTwice t1 = new ThreadTwice();
		t1.start();
		t1.start();
	}
}
