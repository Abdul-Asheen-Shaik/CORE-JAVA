package Day13Patterns;

public class Pattern13 {

	public static void main(String[] args) {
		// outer for loop talks about columns.
				for (int i = 0; i < 10; i++) {
					// inner for loop talks about the columns.
					for (int j = 0; j <= i; j++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}


	}

}