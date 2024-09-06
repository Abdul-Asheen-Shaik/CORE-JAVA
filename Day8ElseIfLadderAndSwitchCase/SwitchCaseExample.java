package Day8ElseIfLadderAndSwitchCase;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("Welcome to the vending machine!");
		System.out.println("Menu");
		System.out.println("1.Coke");
		System.out.println("2.Pepsi");
		System.out.println("3.Water");
		System.out.println("4.Soda");
		System.out.println("5.Sprite");
		System.out.println("6.Exit");
		do {
			System.out.println("Enter your choice (1-6)");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You have selected coke enjoy your drink");
				break;
			case 2:
				System.out.println("You have selected pepsi enjoy your drink");
				break;
			case 3:
				System.out.println("You have selected water enjoy your drink");
				break;
			case 4:
				System.out.println("You have selected soda enjoy your drink");
				break;
			case 5:
				System.out.println("You have selected sprite enjoy your drink");
				break;
			case 6:
				System.out.println("Thank you for using vending machine. Have a nice day");
				break;
			default:
				System.out.println("Invalid choice , please select a valid option");
				break;

			}
			System.out.println();
		} while (choice != 6);
	}

}
