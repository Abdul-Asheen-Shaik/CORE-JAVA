package Day12Patterns;

public class Pattern10RightAngleTriangle {

	public static void main(String[] args) {

		// it is the outer for loop.
		for (int i = 0; i < 10; i++) {
			// inner for loop for columns, prints * based on current row number.
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
