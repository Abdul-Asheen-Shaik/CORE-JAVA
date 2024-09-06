package Day16Arrays;

public class SumOfOddAndEvenNumbersInArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 2, 3, 7, 2, 1, 4, 2, 4, 3 };
		int sumEven = 0;
		int sumOdd = 0;

		for (int number : numbers) {
			if (number % 2 == 0) {
				// numbers is even
				sumEven = sumEven + number;
			} else {
				sumOdd = sumOdd + number;
			}
		}
		System.out.println("Sum of Even numbers in an Array : " + sumEven);
		System.out.println("Sum of Odd numbers in an Aarray : " + sumOdd);
	}

}
