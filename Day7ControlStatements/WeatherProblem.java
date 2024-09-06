package Day7ControlStatements;

import java.util.Scanner;

public class WeatherProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Temperature : ");
		float temp = scanner.nextFloat();
		if (temp >= 30) {
			System.out.println("The weather is too hot wear cotton clothes");
		}
		if ((temp < 30) && (temp >= 20)) {
			System.out.println("The weather is normal enjoy your day ");
		}
		if ((temp < 20) && (temp >= 10)) {
			System.out.println("The weather is too cool wear sweaters ");
		} else {
			// there is no specific logic for else block.
		}
	}

}
