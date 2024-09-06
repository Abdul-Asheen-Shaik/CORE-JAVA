package Day13Patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// outer for loop talks about columns.
		for (int i = 0; i < 10; i++) {
			// inner for loop talks about the columns.
			for (int j = 0; j <= i; j++) {
				System.out.print(9 - j + " ");
			}
			System.out.println();
		}

	}

}
