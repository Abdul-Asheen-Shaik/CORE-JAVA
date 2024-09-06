package Day13Patterns;

public class Pattern19ReverseTriangle {
	public static void main(String[] args) {
		int rows = 10;

		// lower half of the diamond
		// middle row
		for (int i = 0; i < rows - 1; i++) {
			// inner for loop to print spaces before *
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			// inner loop to print * for each row
			for (int k = 0; k < rows - 1 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
