package alg;

import java.util.Scanner;

public class TwoDimensionalArrays {
	void ArrayInsert() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of rows and columns");
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] tdarr = new int[m][n];
		System.out.println("Enter elements into array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				tdarr[i][j] = s.nextInt();
			}
		}
		System.out.println("Elements entered are");
		for (int[] x : tdarr) {
			for (int y : x)
				System.out.print(y + " ");
			System.out.println();
		}
		s.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimensionalArrays t = new TwoDimensionalArrays();
		t.ArrayInsert();

	}

}
