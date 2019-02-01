package alg;


import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int a[] = new int[n];

		for (int x = 0; x < a.length; x++) {
			System.out.println("Enter the value to be inserted into array");
			a[x] = console.nextInt();
		}
		for(int i:a){
			int c=0;
			for(int j=0;j<a.length;j++){
				if(i==a[j])
					c=c+1;
						}
			if(c>1)
				System.out.println("Found "+i+" "+c+" times");
			
		}
		console.close();
	}

}
