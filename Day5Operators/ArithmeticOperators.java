package Day5Operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// System.out.println(10/0); // Raises Arithmetic Exception
		// System.out.println(10.0/0); // Infinity
		// System.out.println(-10.0/0); // -Infinity
		// System.out.println(0.0/0); // NaN not a number
		// System.out.println(-0.0/0); // NaN not a number

		// without using third variable

		int a = 10, b = 20;
		a = a + b;
		System.out.println(a);
		a = a - b;
		System.out.println(a);
		a = a * b;
		System.out.println(a);
		a = a / b;
		System.out.println(a);
		a = a % b;
		System.out.println(a);
	}

}
