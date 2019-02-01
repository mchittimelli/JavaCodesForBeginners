package alg;

public class AlphabetRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method
		char c='A';
		for(int i=1;i<=5;i++){
			for(int k=5-i;k>0;k--)
				System.out.print(" ");
			for(int j=0;j<i;j++){
				System.out.print((char)((int)c+j)+" ");
			}
			
			System.out.println();
			
		}
		for(int i=4;i>=1;i--){
			for(int k=5-i;k>0;k--)
				System.out.print(" ");
			for(int j=0;j<i;j++){
				System.out.print((char)((int)c+j)+" ");
			}
			
			System.out.println();
			
		}
	}

}
