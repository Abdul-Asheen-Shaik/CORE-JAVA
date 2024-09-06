package Day8ElseIfLadderAndSwitchCase;

import java.util.Scanner;

public class MobilePlanUsingElseIfLadder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Mobile Plan : ");
		int PlanMin = scanner.nextInt();
		if (PlanMin <= 100) {
			System.out.println("You have selected Basic Plan");
		} else if (PlanMin <= 300) {
			System.out.println("You have selected Standard Plan");
		} else if (PlanMin <= 500) {
			System.out.println("You have selected Premium Plan");
		} else {
			System.out.println("You are on Unlimited Plan");
		}

	}

}
