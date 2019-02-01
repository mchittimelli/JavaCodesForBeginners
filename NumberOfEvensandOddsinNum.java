package alg;

import java.util.Scanner;

public class NumberOfEvensandOddsinNum {
	
	/*private void EvenOdd(int x) {
		String s = Integer.toString(x);
		int e = 0, o = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.getNumericValue(s.charAt(i)) % 2 == 0)
				e = e + 1;
			else
				o = o + 1;

		}
		System.out.println("Number of Even Digits in the given number are: " + e);
		System.out.println("Number of Odd Digits in the given number are: " + o);

	}*/
	private void EvenOdd1(int y){
		int e=0,o=0;
		while(y>0){
			
			if(y%2==0)
				e=e+1;
			else o=o+1;
			y=y/10;
		}
		if(e==0)
			System.out.println("True");
		else System.out.println("False");
		System.out.println("Number of Even Digits in the given number are: " + e);
		System.out.println("Number of Odd Digits in the given number are: " + o);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		console.close();
		NumberOfEvensandOddsinNum A = new NumberOfEvensandOddsinNum();
	//	A.EvenOdd(n);
		A.EvenOdd1(n);
	}

}
