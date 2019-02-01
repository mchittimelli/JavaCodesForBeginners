package alg;

import java.util.Scanner;

public class EastWest_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the street number");
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0)
			System.out.println("direction is Eastbound");
		else 
			System.out.println("direction is Westbound");
		sc.close();
	}

}
