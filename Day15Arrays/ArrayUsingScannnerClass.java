package Day15Arrays;

import java.util.Scanner;

public class ArrayUsingScannnerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = scanner.nextInt();
		int[] number = new int[size];

// prompt user to enter elements.
		System.out.println("Enter the elements of array : ");
		for (int i = 0; i < size; i++) {
			System.out.println("Element at Index " + i + " :");
			number[i] = scanner.nextInt();
		}
// access the elements
		System.out.println("Number of elements in a given array : " + number.length);
		scanner.close();
	}

}
