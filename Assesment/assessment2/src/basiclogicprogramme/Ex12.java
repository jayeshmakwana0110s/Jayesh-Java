package basiclogicprogramme;

import java.util.Scanner;

/* .Accept number of students from user. I need to give 5 apples to each
student. How many apples are required? */
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers of students : ");
		int a = sc.nextInt();
		int b = (5*a);
		System.out.println("You required " + b + " apples to distributes ");
		sc.close();
	}
}
