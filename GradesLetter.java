package alg;

import java.util.Scanner;

public class GradesLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter grade value of a");
		a=sc.nextInt();
		sc.close();
		/*switch (a){
		case 81-100: 
		System.out.println("Grade A");
				break;
		case 61-80: 
		System.out.println("Grade A+");
				break;	
		}*/
		if(a>=80)
			System.out.println("Grade of a is A");
		else if(80>a&&a>=60)
			System.out.println("Grade of a is B");
		else
			System.out.println("Grade of a is C");
	}

}
