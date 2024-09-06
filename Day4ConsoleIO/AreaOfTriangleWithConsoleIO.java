package Day4ConsoleIO;

import java.util.Scanner;

public class AreaOfTriangleWithConsoleIO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base in meters : ");
		double base = scanner.nextDouble();
		System.out.println("Enter the height in meters : ");
		double height = scanner.nextDouble();
		double area = 0.5*base*height;
		System.out.println("Area of triangle base is : " + base + " meters " + "and height " + height + " meters " + area + " square meters" );
	}

}
