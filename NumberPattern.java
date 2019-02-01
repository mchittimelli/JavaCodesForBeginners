package FinalTerm;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1, a = 0;
		for (int i = 0; i < 5; i++) {
			for (int k = 5 - i; k > 0; k--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print(c + j);
				a = c + j;
			}
			c++;

			for (int j = 1; j <= i; j++) {
				a--;
				System.out.print(a);

			}

			System.out.println();

		}
	}

}
