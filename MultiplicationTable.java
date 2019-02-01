package Activity4;

import java.util.Scanner;

public class MultiplicationTable {

	void Table(int n) {
		System.out.println("Multiplication table of " + n + " is: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x  " + i + "  =   " + n * i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable m = new MultiplicationTable();
		System.out.println("Enter a number for it's multiplication table");
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		m.Table(num);
		console.close();
	}

}
