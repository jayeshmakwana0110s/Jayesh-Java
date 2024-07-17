package com.module2;

/* Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are
subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes.
*/

abstract class Bank{
	abstract public void getBalance();
}

class Bank1 extends Bank{

	int balance;
	
	public Bank1(int a)
	{
		balance = a;
	}
	@Override
	public void getBalance() {
		System.out.println("Balance in bank1 is : " + this.balance);
	}
	
}
class Bank2 extends Bank{

	int balance;
	
	public Bank2(int a)
	{
		balance = a;
	}
	@Override
	public void getBalance() {
		System.out.println("Balance in bank2 is : " + this.balance);
	}
	
}
class Bank3 extends Bank{

	int balance;
	
	public Bank3(int a)
	{
		balance = a;
	}
	@Override
	public void getBalance() {
		System.out.println("Balance in bank3 is : " + this.balance);
	}
	
}
public class Problem14 {
	public static void main(String[] args) {
		Bank1 b1 = new Bank1(100);
		Bank2 b2 = new Bank2(150);
		Bank3 b3 = new Bank3(200);
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}
}
