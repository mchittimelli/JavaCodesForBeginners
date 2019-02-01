package alg;

import java.util.Scanner;

public class AlphabetTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any character");
		String c1=sc.next();
		//System.out.println((int)c.charAt(0));
		//System.out.print((char)((int)c.charAt(0)+1));
		int c=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++){
				System.out.print((char)((int)c1.charAt(0)+c)+" ");
				c++;
			}
			
			System.out.println();
		}
		sc.close();
	}

}
