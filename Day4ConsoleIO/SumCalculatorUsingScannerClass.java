package Day4ConsoleIO;

import java.util.Scanner;

public class SumCalculatorUsingScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
        int sum = number1+number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
	}

}
