package Day8ElseIfLadderAndSwitchCase;

import java.util.Scanner;

public class GradesUsingElseIfLadder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Marks :");
		float Marks = scanner.nextFloat();
		if (Marks >= 80) {
			System.out.println("You have passed in Distinction");
		} else if (Marks >= 70 && Marks < 80) {
			System.out.println("You have passed in First Class");
		} else if (Marks >= 60 && Marks < 70) {
			System.out.println("You have passed in Second Class");
		} else if (Marks >= 50 && Marks < 60) {
			System.out.println("You have passed in Third Class");
		} else {
			System.out.println("FAIL");
		}

	}
}
