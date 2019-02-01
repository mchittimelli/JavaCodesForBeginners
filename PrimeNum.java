package alg;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1, a;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		a = sc.nextInt();
		
		for(int i=2;i<a;i++){
			if(a%i==0)
				count=count+1;
			if(count>1)
				break;
		}
		if(count>1)
			System.out.println("Number is not prime");
		else if (a==1)
				System.out.println("Number is not prime");
			else
				System.out.println("number is prime");
		sc.close();
		
	}

}
