package alg;

import java.util.Scanner;

public class AverageOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		float sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a");
		a=sc.nextInt();
		
		b=sc.nextInt();
		
		sum=a+b;
				
		System.out.println("average is"+ sum/2);
		sc.close();
	}

}
