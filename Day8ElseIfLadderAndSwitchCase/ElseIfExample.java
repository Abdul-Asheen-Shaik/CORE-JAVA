package Day8ElseIfLadderAndSwitchCase;

import java.util.Scanner;

public class ElseIfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your city name : ");
		String cityName = scanner.next();

		if (cityName.equalsIgnoreCase("Hyderabad")) {
			System.out.println("Hello Hyderabadi.....Aadaab..");
		} else if (cityName.equalsIgnoreCase("Chennai")) {
			System.out.println("Hello Madrasi.....Vanakkam..");
		} else if (cityName.equalsIgnoreCase("Banglore")) {
			System.out.println("Hello Kannadiga.....Namaskar..");
		} else {
			System.out.println("Please enter valid city name....");
		}
	}

}
