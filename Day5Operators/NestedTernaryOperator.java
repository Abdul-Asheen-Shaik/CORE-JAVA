package Day5Operators;

import java.util.Scanner;

public class NestedTernaryOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student marks : ");
		int marks = scanner.nextInt();

		char grade = (marks >= 90) ? 'A'
				: (marks >= 80) ? 'B' : 
					(marks >= 70) ? 'c' : 
						(marks >= 60) ? 'D' : 
							(marks >= 50) ? 'E' :
								'F';
		System.out.println("Student Grade : " + grade);

	}

}
