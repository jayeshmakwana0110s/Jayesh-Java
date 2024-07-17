package com.string_module2;
/*Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters.*/
class Shake
{
	public void thichshek(int price,String name)
	{
		System.out.println("The price of the " + name + "thickshake is " + price);
	}
	public void thichshek(String name,int price)
	{
		System.out.println("The price of the " + name + "thickshake is " + price);
	}
}
public class Problem13 {
	public static void main(String[] args) {
		Shake s = new Shake();
		s.thichshek(200, "Mango");
		s.thichshek("Angeer",350);
	}
}
