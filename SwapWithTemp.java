package alg;

import java.util.Scanner;

public class SwapWithTemp {
	public static void main(String[]args){
		int a;
		int b;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a");
		a=sc.nextInt();
		
		System.out.println("enter value of b");
		b=sc.nextInt();
		
		System.out.println("before swap a="+a+" and b="+b);
		
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("after swap a="+a+" and b="+b);
		sc.close();		}
}
