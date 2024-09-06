package Day7ControlStatements;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		if(number>0) {
			System.out.println("The number " + number + " is positive " );
		}else {
			// there is no specific logic for else block.
			
		}

	}

}
