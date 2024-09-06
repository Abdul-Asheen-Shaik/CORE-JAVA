package Day9ExampleProgrames;

import java.util.Scanner;

public class EvenNumbersUsingWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();
		int i = 0;
		while (i <= number) {
			System.out.println(i);
			i = i + 2;
		}

	}

}
