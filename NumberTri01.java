package Activity4;

public class NumberTri01 {
	public static void main(String[] args) {
		int c=0;
	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			if (c%2==0)
			System.out.print("1 ");
			else
				System.out.print("0 ");
			c++;
		}if(i%2==0)
			c++;
		System.out.println();
	}
	}
}
