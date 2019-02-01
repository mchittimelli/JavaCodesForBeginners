package alg;

import java.util.Scanner;

public class NumberTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of cardinals: ");
		int a = keyboard.nextInt();
		
		//int c=1;
		

		for (int i = 1,c=1; i <= a; i++) {
			for (int k =1; k <= i; k++,c++) {
				//System.out.print(k+" ");
				System.out.print(c+" ");
				//c=c+1;
			
			} // without entering new line
			System.out.println();// entering new line
		} 

		keyboard.close();
	}
}
