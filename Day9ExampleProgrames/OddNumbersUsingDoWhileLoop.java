package Day9ExampleProgrames;

import java.util.Scanner;

public class OddNumbersUsingDoWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scanner.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i=i+2;
		} while (i < number);

	}

}
