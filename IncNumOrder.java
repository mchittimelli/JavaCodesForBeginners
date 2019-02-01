package Activity4;

import java.util.ArrayList;

import java.util.Scanner;

public class IncNumOrder {
	void NumOrder(int num) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		while (num > 0) {

			a.add(num % 10);
			num = num / 10;
		}
		boolean order = false;
		for (int k = 0; k < a.size(); k++) {
			// System.out.println(a.get(k));
			for (int p = 0; p < a.size() - 1; p++) {
				if (a.get(p) > a.get(p + 1)) {
					order = true;
				} else {
					order = false;
					break;
				}
			}
		}
		if (order == true)
			System.out.println("Number is in increasing order : TRUE");
		else
			System.out.println("Number is not in increasing order : false");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number:");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		IncNumOrder N=new IncNumOrder();
		N.NumOrder(n);
		console.close();

	}

}
