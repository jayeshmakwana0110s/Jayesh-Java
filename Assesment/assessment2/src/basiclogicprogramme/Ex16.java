package basiclogicprogramme;

import java.util.HashMap;
import java.util.Scanner;

/* Convert country’s name in abbreviate form */
public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> a = new HashMap<String,String>();
		a.put("Anguilla", "AI");
		a.put("Austria", "AT");
		a.put("Brazil", "BR");
		a.put("Chile", "CL");
		a.put("Belarus", "BY");
		a.put("Ghana", "GH");
		a.put("Laos", "LA");
		a.put("Nepal", "NP");
		
		System.out.println("Enter the country name : ");
		String b = sc.next();
		System.out.println("Abbreviate is : " + a.get(b));
		sc.close();
	}
}
