package alg;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values to be inserted into array "+ n+" times");
		for (int x = 0; x < arr.length; x++) {
			
			arr[x] = console.nextInt();
		}
		//insertion sort code begins here
		int j,key;
for (int i=1;i<n;i++){
	 j=i-1;
	 key=arr[i];
	 //this while loop is for moving the elements other than key, 1 position ahead
	 while(j>=0&&arr[j]>key){
		 arr[j+1]=arr[j];
		 j--;
	 }
	 //moving the key to first position (j+1)
	 arr[j+1]=key;
} //end of insertion sort

for(int x:arr){
	System.out.print(x+" ");
}
console.close();
	}

}
