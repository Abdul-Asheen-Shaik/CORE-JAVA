package Day6AssignmentPrograms;

import java.util.Scanner;

public class AreaOfSemiCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = scanner.nextDouble();
		double AreaOfSemiCircle = 0.5 * 3.14 * radius * radius;
		System.out.println("The area of semi circle is : " + AreaOfSemiCircle);

	}

}
