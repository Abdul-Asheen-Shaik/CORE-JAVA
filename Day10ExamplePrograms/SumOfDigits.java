package Day10ExamplePrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		int originalNumber = number;
		int sum = 0;
		int remainder;
		while (number != 0) {
			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}
		System.out.println("The sum of digits in a given number " + originalNumber + " is : " + sum);
	}

}
