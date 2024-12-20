package basiclogicprogramme;

import java.util.Scanner;

/* Calculate compound interest */
public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double principal = sc.nextInt();
		System.out.println("Enter the rate : ");
		double rate = sc.nextInt();
		System.out.println("Enter the time in year : ");
		double time = sc.nextInt();
		double cinterest = principal * 
                (Math.pow((1 + rate / 100), time));
		System.out.println("comppund interest is : " + cinterest);
		sc.close();
		
	}
}
