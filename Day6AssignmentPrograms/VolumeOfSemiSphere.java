package Day6AssignmentPrograms;

import java.util.Scanner;

public class VolumeOfSemiSphere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of SemiSphere : ");
		double radius = scanner.nextFloat();
		double VolumeOfSemiSphere =  0.6*3.14*radius*radius*radius;
		System.out.println("The Volume of SemiSphere is : " + VolumeOfSemiSphere);
	}

}
