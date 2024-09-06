package Day5Operators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    /*	
	    System.out.println("Enter the age : ");
		int age = scanner.nextInt();	
		
		String result = (age > 18) ? "Major" : "Minor";
		System.out.println(result);
		 */
		
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		String result = (number>0) ? "Positive" : "Negative";
		System.out.println(result);

	}

}
