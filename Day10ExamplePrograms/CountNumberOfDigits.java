package Day10ExamplePrograms;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println("The number of digits in a given number: " + count);

	}

}
