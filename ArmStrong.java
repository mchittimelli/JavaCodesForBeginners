package FinalTerm;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  number ");
		int a = sc.nextInt();
		int b = a;
		double sum = 0;

		while (a >0) {
			sum = sum + Math.pow(a % 10, 3);
			a = a / 10;
		}
		if (sum == b) {
			System.out.println("Given number is Armstrong number");
		} else
			System.out.println("Given number is not an Armstrong number");
		sc.close();
	}

}
