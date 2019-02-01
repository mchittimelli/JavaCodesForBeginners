package alg;

import java.util.Scanner;

public class StudentAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("enter no. of subjects");
		int S=sc.nextInt();
		int n=S;
		
		float sum=0;
				while(S>0){
					System.out.println("enter one subject marks");
					sum=sum+sc.nextFloat();
					S--;
				}
			System.out.println("average is "+ sum/n);	
 sc.close();
	}

}
