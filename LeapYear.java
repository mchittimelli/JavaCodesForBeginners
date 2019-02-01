package Activity4;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year:");
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		
		if(num%4==0&&(num%100!=0||num%400==0))
			System.out.println(num+" year is leap year");
		else
			System.out.println(num+" year is not leap year");
		console.close();

	}

}
