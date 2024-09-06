package Day4ConsoleIO;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		double radius = scanner.nextDouble();
		double area = 3.142*radius*radius;
		System.out.println("The radius of circle is : " + radius + " The area of circle is : " + area);

	}

}
