package FinalTerm;

public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print((char)((int)c1+k));
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) ((int) c1 + i - j));
			}
			System.out.println();
		}
	}

}
