package Day6AssignmentPrograms;

import java.util.Scanner;

public class AreaOfSphere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of Sphere : ");
		double radius = scanner.nextFloat();
        double AreaOfSphere = 4*3.14*radius*radius;
        System.out.println("The Area of Sphere is : " + AreaOfSphere);
	}

}
