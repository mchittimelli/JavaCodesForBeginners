package FinalTerm;


import java.util.ArrayList;
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements you want to enter :");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers ");
		for(int i=0;i<n;i++){
			a[i]=console.nextInt();
		}
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> m= new ArrayList<Integer>();
		
		while(n>0){
			if(a[n-1]>=0)
				l.add(a[n-1]);
			else
				m.add(a[n-1]);
			n--;
		}
		for(int j=l.size()-1;j>=0;j--)
			System.out.print(l.get(j)+" ");
		for(int k=m.size()-1;k>=0;k--)
			System.out.print(m.get(k)+" ");
		console.close();
	}

}
