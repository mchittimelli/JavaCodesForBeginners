package alg;

import java.util.Scanner;

public class NoOfDigits {
	  static int countDigit(long n) 
	    { 
	        int count = 0; 
	        while (n != 0) { 
	            n = n / 10; 
	            ++count; 
	        } 
	        return count; 
	    } 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		
		//either the below code or commented code
		long x=sc.nextLong();
		System.out.println(countDigit(x));
		
		
		/*int a=sc.nextInt();
		String s=Integer.toString(a);
		
		System.out.println("Number of Digits in the number are: "+s.length());
		
		*/
		sc.close();
	}

}
