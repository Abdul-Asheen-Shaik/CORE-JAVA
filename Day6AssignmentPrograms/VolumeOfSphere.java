package Day6AssignmentPrograms;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of Sphere : ");
		double radius = scanner.nextFloat();
		double VolumeOfSphere =  1.3*3.14*radius*radius*radius;
		System.out.println("The Volume of Sphere is : " + VolumeOfSphere);
		
	}

}
