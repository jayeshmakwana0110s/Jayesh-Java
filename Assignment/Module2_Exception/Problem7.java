package com.exception_module2;

import java.util.Scanner;

@SuppressWarnings("serial")
/* 
  W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500
*/
class AmountException extends Exception
{
	double amount;
	public AmountException(double need)
	{
		this.amount = need;
	}
}

class ATM
{
	double balance = 0;
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdrawal(double amount) throws AmountException
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdral successfull !!!");
		}
		else
		{
			double need = amount - balance;
			throw new AmountException(need);
		}
	}
}
public class Problem7 {
	public static void main(String[] args) {
		ATM a = new ATM();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to deposit : ");
		double b = sc.nextDouble();
		a.deposit(b);
		System.out.println("Enter amount you want to withdrawal : ");
		double c = sc.nextDouble();
		try
		{
			a.withdrawal(c);
		}
		catch (AmountException e) 
		{
			System.out.println("You need more " + e.amount + " for withdrawal !!");
			e.printStackTrace();
		}
		sc.close();
	}
}
