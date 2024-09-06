package Day12Patterns;

public class Pattern1 {
	public static void main(String[] args) {
		int rows = 10, columns = 10;    // i rows , j columns
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
