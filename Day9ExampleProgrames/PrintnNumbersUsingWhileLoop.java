package Day9ExampleProgrames;

import java.util.Scanner;

public class PrintnNumbersUsingWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Number = scanner.nextInt();

		int i = 0;
		while (i <= Number) {
			System.out.println(i);
			i++; // to print n numbers

		}

	}

}
