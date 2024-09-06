package Day13Patterns;

public class Pattern17 {

	public static void main(String[] args) {
		int rows = 10;
		// outer for loop.
		for (int i = 0; i < rows; i++) {
			// inner for loop print * in each row.
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" *");
			}
			System.out.println();

		}

	}

}
