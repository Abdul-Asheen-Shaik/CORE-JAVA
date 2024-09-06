package Day4ConsoleIO;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principle : ");
		double principle = scanner.nextDouble();
		System.out.println("Enter the Time : ");
		double time = scanner.nextDouble();
		System.out.println("Enter the Rate : ");
		double rate = scanner.nextDouble();
		double SI = principle*time*rate/100;
		System.out.println("The principle of SI is : " + principle + " The time of SI is : " + time + " The rate of SI is : " + rate + " The Simple Intrest is : " + SI);
		double Amount = principle+SI;
		
		System.out.println("Total Amount = " + Amount);
	}

}
