package basiclogicprogramme;

/* Calculate person’s Annual salary */
import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mothly salary : ");
		int msalary  = sc.nextInt();
		double asalary = 12*msalary;
		System.out.println("Annual salary is : " + asalary);
		sc.close();
	}
}
