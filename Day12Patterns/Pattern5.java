package Day12Patterns;

public class Pattern5 {

	public static void main(String[] args) {
	/*	for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print((9-i) + " ");
			}
			System.out.println();
		} */
		
		for (int i = 9; i > 0; i--) {
			for (int j = 0; j < 9; j++) {
				System.out.print(i + "   ");
			}
			System.out.println();
		}

	}

}
