package alg;

import java.util.Scanner;

public class Largest3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,largest;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 3 numbers");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b){
			if(a>c)
				largest=a;
			else
				largest=c;
		}
		else if(b>c)
			largest=b;
		else largest=c;
		
		System.out.println("largest of numbers is "+ largest);
	//	System.out.printf(a>b,b>c,a>c);
		sc.close();
	}

}
