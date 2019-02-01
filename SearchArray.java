package alg;

import java.util.Scanner;

public class SearchArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int a[] = new int[n];
		for (int x = 0; x < a.length; x++) {
			System.out.println("Enter the value to be inserted into array");
			a[x] = console.nextInt();
		}
		System.out.println("enter the value to be searched");
		int s = console.nextInt();
		int f = 0, sum = 0;

		for (int x = 0; x < a.length; x++) {
			sum = sum + a[x];
			if (s == a[x]) {
				System.out.println("Element found at index " + x + " in the array");
				f = f + 1;

			}
		}
		if (f == 0)
			System.out.println("Element not found in array ");
		else
			System.out.println("Element found in array " + f + " times");
		System.out.println("sum of elements in the array is " + sum);
		console.close();
	}

}
