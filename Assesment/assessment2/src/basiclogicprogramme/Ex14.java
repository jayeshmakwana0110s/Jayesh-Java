package basiclogicprogramme;

import java.util.Scanner;

/* Find ascii value of given number */
public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		while(a>0)
		{
			int b = a%10;
			System.out.println("ASCII of : " + b + " is " + (b+48));
			a = a/10;
		}
		sc.close();
	}
}
