package alg;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float a;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter grade value of a");
		a=sc.nextFloat();
		
		if(a>=60)
			System.out.println("a is pass");
		else 
			System.out.println("no pass");
		sc.close();
	}

}
