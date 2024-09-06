package Day4ConsoleIO;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principle : ");
		double principle = scanner.nextDouble();
		System.out.println("Enter the Rate : ");
		double rate = scanner.nextDouble();
		System.out.println("Enter the Time : ");
		double time = scanner.nextDouble();
		double CI = principle*(Math.pow((1+rate/100),time));
		System.out.println("The principle of CI is : " + principle + " The rate of CI is : " + rate + " The time of CI is : " + time + " The Compound Intrest is : " + CI);

	}

}
