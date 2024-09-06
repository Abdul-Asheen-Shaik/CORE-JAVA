package Day6AssignmentPrograms;

import java.util.Scanner;

public class VolumeOfCube {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the area of cube : ");
		float area = scanner.nextFloat();
		float VolumeOfCube = area * area * area;
		System.out.println("The volume of cube is : " + VolumeOfCube);

	}

}
