package com.module2;

/*Write a java program to find out the max number from given array using function */

public class Problem1 {
	public int findMaxNum(int[] z)
	{
		int[] a = z;
		int max = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {10,20,30,90,40,50,60,70};
		Problem1 p1 = new Problem1();
		int y = p1.findMaxNum(a);
		System.out.println("The max number of this array is : " + y );
	}
}
