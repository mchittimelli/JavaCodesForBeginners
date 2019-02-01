package alg;

import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, a;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter max number till where you require the primes");
		a = sc.nextInt();
		
		if(a==1)
			System.out.println("no primes exist");
		else
			
		for(int j=2;j<=a;j++){
			count=1;
		for(int i=2;i<=j;i++){
			if(j%i==0)
				count=count+1;
							
		}if(count<3)
			System.out.println(j);
		}
		
		sc.close();
	}

}
