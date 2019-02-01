package alg;


import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter array 1 rows");
		int m = console.nextInt();
		System.out.println("Enter array 1 columns");
		int n = console.nextInt();
		System.out.println("Enter array 2 rows");
		int p = console.nextInt();
		System.out.println("Enter array 2 columns");
		int q = console.nextInt();
		int[][] a= new int[m][n];
		int[][] b =new int[p][q];
		int[][] prod=new int[m][q];
		System.out.println("Insert Array 1 values");
		 for(int i=0;i<m;i++) {
	            for (int j=0;j<n;j++) {
	                a[i][j]=console.nextInt();
	            }
	}
		 System.out.println("Insert Array 2 values");
		 for(int i=0;i<p;i++) {
	            for (int j=0;j<q;j++) {
	                b[i][j]=console.nextInt();
	            }
	}
		 System.out.println("Array 1 is ");
	      for(int[] row : a) {
	            for (int s : row) {
	                System.out.print(s + "    ");
	            }
	            System.out.println();
	        }
	      System.out.println("Array 2 is ");
	      for(int[] row : b) {
	            for (int d : row) {
	                System.out.print(d + "    ");
	            }
	            System.out.println();
	        }
	      if(n==p){
	    	  
	    	  for(int x=0;x<m;x++){
	    		  for(int y=0;y<q;y++){
	    			  prod[x][y]=0;
	    			  for(int z=0;z<n;z++){
	    				  prod[x][y]=prod[x][y]+a[x][z]*b[z][y];
	    			  }
	    		  }
	    	  }
	    	  System.out.println("Matrix product is ");
	    	  for(int[] row : prod) {
		            for (int d : row) {
		                System.out.print(d + "    ");
		            }
		            System.out.println();
		        }
	      }
	    	  
	      else System.out.println("Matrix multiplication not possible");
	      console.close();
	      
}
}