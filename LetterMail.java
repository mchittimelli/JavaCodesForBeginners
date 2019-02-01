package alg;

import java.util.Scanner;

public class LetterMail {
//program for printing no of stamps required for mailing letters
	//1 stamp for 5 letters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no.of letters to be mailed");
		
		Scanner sc= new Scanner(System.in);
		int l=sc.nextInt();
		
		int counter=0;
		counter=l/5;
		
		if(l%5!=0)
			counter=counter+1;
		
		System.out.println("no of stamps required are: "+counter);
		
		sc.close();
		
		
		

	}

}
