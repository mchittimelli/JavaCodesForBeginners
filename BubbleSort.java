package alg;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,1,6};
		
		int temp = a[0];
		for(int j=0;j<a.length;j++){
		 for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				temp = a[i + 1];
				a[i + 1] = a[i];
				a[i] = temp;
			}  
			}
		}
		System.out.println("Sorted array is ");
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");
		
	}

}
