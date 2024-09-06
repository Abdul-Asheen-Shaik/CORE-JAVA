package Day6AssignmentPrograms;

import java.util.Scanner;

public class VolumeOfCuboid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of cuboid : ");
		float length = scanner.nextFloat();
		System.out.println("Enter the width of cuboid : ");
		float width = scanner.nextFloat();
		System.out.println("Enter the height of cuboid : ");
		float height = scanner.nextFloat();
		double VolumeOfCuboid = length * width * height;
		System.out.println("The length is : " + length + " The width is : " + width + " The height is : " + height
				+ " Th volume of Cuboid is  : " + VolumeOfCuboid);

	}

}
