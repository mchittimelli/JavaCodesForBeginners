package alg;

import java.util.Scanner;

public class ArraySumSearch {

	public static void main(String[] args) {
		System.out.println("Enter array size");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the values to be inserted into array");
		for (int x = 0; x < a.length; x++) {

			a[x] = console.nextInt();
		}
		System.out.println("The array elements are ");
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Enter the sum to be searched");
		int sum = console.nextInt();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == sum)
					System.out.println("The sum can be obtained by adding " + a[i] + " at a[" + i + "] and " + a[j]
							+ " at a[" + j + "]");

			}
		}
		console.close();

	}

}
