package com.module2;

public class Problem2 {
	public int secoundMaxNum(int[] x)
	{
		int[] a = x;
		int max = a[0];
		int sm = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > max)
			{
				sm = max;
				max = a[i];
			}
		}
		return sm;
	}
	
	public static void main(String[] args) {
		int[] a = {10,60,50,30,20,70,80};
		Problem2 p2 = new Problem2();
		int sm = p2.secoundMaxNum(a);
		System.out.println("The secound max number is : " + sm);
	}
}
