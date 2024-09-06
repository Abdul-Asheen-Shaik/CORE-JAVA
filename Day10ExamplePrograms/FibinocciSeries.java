package Day10ExamplePrograms;

import java.util.Scanner;

public class FibinocciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms in Fibinocci Series : ");
		int NumberOfTerms = scanner.nextInt();
		int FirstTerm = 0;
		int SecondTerm = 1;
		System.out.println("Fibinocci Series : ");
		System.out.print(FirstTerm + "  " + SecondTerm + "  ");
		for (int i = 2; i < NumberOfTerms; i++) {
			int NextTerm = FirstTerm + SecondTerm;
			System.out.println(NextTerm + "  ");
			FirstTerm = SecondTerm;
			SecondTerm = NextTerm;

		}

	}

}
