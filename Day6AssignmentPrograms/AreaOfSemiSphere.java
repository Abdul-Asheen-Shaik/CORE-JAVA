package Day6AssignmentPrograms;

import java.util.Scanner;

public class AreaOfSemiSphere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of SemiSphere : ");
		double radius = scanner.nextFloat();
		double AreaOfSemiSphere =  3*3.14*radius*radius;
		System.out.println("The Area of SemiSphere is : " + AreaOfSemiSphere);

	}

}
