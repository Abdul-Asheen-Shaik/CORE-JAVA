package Day9ExampleProgrames;

import java.util.Scanner;

public class ATMExampleUsingSwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the ATM");
		System.out.println();
		System.out.println("1.Check Balance");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Deposite Amount");
		System.out.println("4.Exit");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Your Balance is $1000");
			break;
		case 2:
			System.out.println("Enter the withdraw Amount : ");
			int WithDrawAmount = scanner.nextInt();
			System.out.println("The amount withdrawn is : " + WithDrawAmount);
			break;
		case 3:
			System.out.println("Enter the Deposite Amount : ");
			int DepositeAmount = scanner.nextInt();
			System.out.println("The amount deposited is : " + DepositeAmount);
			break;
		case 4:
			System.out.println("Thank You for using ATM.. GoodBye Have a good day...");
			break;
		default:
			System.out.println("Invalid choice .. Please enter a valid choice...");

		}

	}

}
