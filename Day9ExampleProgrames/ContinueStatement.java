package Day9ExampleProgrames;

import java.util.Scanner;

public class ContinueStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			// System.out.println(i);
			// continue;
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
