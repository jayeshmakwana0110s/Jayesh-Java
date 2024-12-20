package basiclogicprogramme;

import java.util.Scanner;

/* .Find character value from ascii */
public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		String a = sc.next();
		int b = a.charAt(0);
		System.out.println("Ascii value is : " + b);
		sc.close();
	}
}
