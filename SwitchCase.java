package alg;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter fruit letter");
		String fruit = sc.next();
		String name;

		switch (fruit) {
		case "A":
			name = "Apple";
			break;
		case "O":
			name = "Orange";
			break;
		case "P":
			name = "Peach";
			break;
		case "p":
			name = "Pear";
			break;
		default:
			name = "Other";
			break;
		}
		System.out.println(name);
		sc.close();

	}

}
