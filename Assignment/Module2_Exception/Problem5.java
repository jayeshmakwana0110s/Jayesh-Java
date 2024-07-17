package com.exception_module2;

public class Problem5 {
	public static void main(String[] args) {
		try {
			int c = Integer.parseInt(args[0]);
			int d = Integer.parseInt(args[1]);
			int e = c/d;
			System.out.println("Division of two number is : " + e);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
