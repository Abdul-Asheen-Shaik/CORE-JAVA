package Day9ExampleProgrames;

import java.util.Scanner;

public class FactorialNumberUsingFForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Number = scanner.nextInt();
		int result = 1;
		for (int i = 1; i <= Number; i++) {
			result = result * i;
		}
		System.out.println("Factorial of " + Number + " is : " + result);
	}

}
