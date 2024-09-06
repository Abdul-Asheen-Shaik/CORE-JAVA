package Day16Arrays;

public class CountOccurancesArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 2, 3, 7, 2, 1, 4, 2, 4, 3 };
		int target = 2;
		int count = 0;
		for (int number : numbers) {
			if (number == target) {
				count++;
			}
		}
		System.out.println("Occurances of " + target + " in array : " + count);

	}

}
