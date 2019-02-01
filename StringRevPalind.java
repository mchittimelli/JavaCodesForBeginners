package alg;

import java.util.Scanner;

public class StringRevPalind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string you want to reverse");
		String str = sc.nextLine();
		String strrev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strrev = strrev + str.charAt(i);

		}
		System.out.println("Reverse value is: "+strrev);
		sc.close();
		if (strrev.equals(str))
			System.out.println("It is Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
