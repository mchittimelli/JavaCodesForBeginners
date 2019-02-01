package alg;

import java.util.ArrayList;

import java.util.Scanner;

public class GreatestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("enter  number");
			l.add(sc.nextInt());

		}
		int max = l.get(0);
		for (int j = 0; j < l.size(); j++) {
			if (max < l.get(j))
				max = l.get(j);

		}
		System.out.println("greatest number is " + max);
		int k=l.indexOf(max);
		max=l.get(k+1);
		for(int i = 0;i<10;i++){
			if(i==k)
				continue;
			
				if (max < l.get(i))
					max = l.get(i);

		
		}
		System.out.println("2nd greatest number is " + max);
		sc.close();
	}

}
