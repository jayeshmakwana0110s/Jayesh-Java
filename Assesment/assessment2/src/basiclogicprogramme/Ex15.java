package basiclogicprogramme;

import java.util.Scanner;

/* Convert school’s name in abbreviated form */

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		char fn = sc.next().charAt(0);
		System.out.println("Enter middle name : ");
		char mn = sc.next().charAt(0);
		System.out.println("Enter last name : ");
		String ln = sc.next();
		System.out.println("Abbreviated Name : " + fn + "." + mn + "." + ln);
		sc.close();
	}
}
