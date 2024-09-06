package Day10ExamplePrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();

		int reversedNumber = 0;
		int originalNumber = number;
		while (originalNumber != 0) {
			int remainder = originalNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			originalNumber = originalNumber / 10;
		}
		if (number == reversedNumber) {
			System.out.println(number + " is a palindrome number");
		} else {
			System.out.println(number + " is not a palindrome number");
		}
	}

}
