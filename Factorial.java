package alg;

import java.util.Scanner;

public class Factorial {
	int x=1;
	void fact(int s){
		if(s==1||s==0)
		System.out.println("Factorial is "+x);
		else
		{
			x=x*s;
			fact(s-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any  number ");
		
		 a=sc.nextInt();
		sc.close();
		
		Factorial f=new Factorial();
		
		f.fact(a);
		

}
}
