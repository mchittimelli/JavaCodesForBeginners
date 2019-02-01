package alg;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, sum, n;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of series you need");
		n = sc.nextInt();
		if (n == 0)
			System.out.println("No series");
		if (n > 0)
			System.out.println(a);
		if (n > 1)
			System.out.println(b);
		for (int i = 3; i <= n; i++) {

			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
		sc.close();

	}

}
