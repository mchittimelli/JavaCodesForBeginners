package alg;

import java.util.Scanner;

public class SortedArray {

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
		int temp = a[0];
		for(int j=0;j<a.length;j++){
		 for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				temp = a[i + 1];
				a[i + 1] = a[i];
				a[i] = temp;
			}  }
		}
System.out.println("Sorted array is ");
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");
		console.close();
	}

}
