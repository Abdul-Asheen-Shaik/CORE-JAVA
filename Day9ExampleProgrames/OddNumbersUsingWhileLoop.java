package Day9ExampleProgrames;

import java.util.Scanner;

public class OddNumbersUsingWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int numbers = scanner.nextInt();
		int i = 1;
		while (i < numbers) {
			System.out.println(i);
			i = i + 2;
		}

	}

}
