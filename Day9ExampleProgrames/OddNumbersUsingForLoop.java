package Day9ExampleProgrames;

import java.util.Scanner;

public class OddNumbersUsingForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scanner.nextInt();
		for(int i=1;i<number;i=i+2) {
			System.out.println(i);
		}

	}

}
