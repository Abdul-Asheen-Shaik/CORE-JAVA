package Day16Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] sourceArray = { 1, 2, 3, 4, 5 };
		int[] destinationArray = new int[sourceArray.length];

		// copy elements from source array to destination array.
		for (int i = 0; i < sourceArray.length; i++) {
			destinationArray[i] = sourceArray[i];

		}

		// print destination array elements.
		System.out.println("Destination array elements : ");
		// enhanced for loop
		for (int number : destinationArray) {
			System.out.println(number + " ");
		}
		System.out.println();

	}

}
