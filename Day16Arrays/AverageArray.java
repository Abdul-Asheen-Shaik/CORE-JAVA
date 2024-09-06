package Day16Arrays;

public class AverageArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		double average = 0.0;
		int sum = 0;
		// calculate average array of elements.
		for (int number : numbers) {
			sum = sum + number;
		}
		average = sum / numbers.length;
		System.out.println("The average sum of elements in an array : " + average);
	}

}
