package alg;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int arr[] = new int[n];
		for (int x = 0; x < arr.length; x++) {
			System.out.println("Enter the value to be inserted into array");
			arr[x] = console.nextInt();
		}
		console.close();
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if (arr[j]<arr[min])
				{
					min=j;
					int temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int x:arr){
			System.out.print(x+" ");
			
		}
		
	}

}
