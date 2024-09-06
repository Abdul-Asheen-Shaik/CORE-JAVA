package Day7ControlStatements;

import java.util.Scanner;

public class ATMWithDrawal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double withdrawlAmount = scanner.nextDouble();
		double balance = 10000.0;
		if (withdrawlAmount <= balance) {
			balance = balance - withdrawlAmount;
			System.out.println("The amount is successfully withdrawn... " + " The remaining balance is : " + balance);

		} else {
			System.out.println("Insufficient Funds....");
		}

	}

}
