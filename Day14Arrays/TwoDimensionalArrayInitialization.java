package Day14Arrays;

public class TwoDimensionalArrayInitialization {

	public static void main(String[] args) {
		// Multi Dimensional Array Creation.
		int[][] a = new int[2][2];
		a[0][0] = 10; // Array Initialization
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;

		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);

	}

}
