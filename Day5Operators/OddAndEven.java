package Day5Operators;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		String result = num % 2 == 0 ? "Even" : "Odd";
		System.out.println(result);
	}

}
