package FinalTerm;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values to be inserted into array " + n + " times");
		for (int x = 0; x < arr.length; x++) {

			arr[x] = console.nextInt();
		}

		int j, key;
		for (int i = 1; i < n; i++) {
			j = i - 1;
			key = arr[i];

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}
System.out.println("Sorted array in Positive and negative");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		console.close();
	}

}
