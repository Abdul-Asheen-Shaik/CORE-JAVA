package Day13Patterns;

public class Pattern18Triangle {

	public static void main(String[] args) {
		int rows = 10;

		// outer for loop for each row.
		for (int i = 0; i < rows; i++) {
			// inner for loop to print spaces before *.
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			// inner for loop print * for each row.
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
