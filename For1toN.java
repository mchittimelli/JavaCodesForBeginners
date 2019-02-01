package alg;

import java.util.Scanner;

public class For1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any max number ");
		int a=sc.nextInt();
		sc.close();
		for(int i=1;i<=a;i++){
			System.out.println(i);
			//System.out.println("\n");
		}
	}

}
