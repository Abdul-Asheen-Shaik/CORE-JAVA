package Day9ExampleProgrames;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scanner.nextInt();
		for (int i = 1; i < number; i++) {
			if (i > 100) {
				break;
			}
			System.out.println(i);
		}

	}

}
