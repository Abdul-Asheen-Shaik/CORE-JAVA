package Day7ControlStatements;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		if(num>0) {
			System.out.println("The Number " + num + " is Positive");
		}else {
			System.out.println("The Number " + num + " is Negative");
		}
		
	}

}
