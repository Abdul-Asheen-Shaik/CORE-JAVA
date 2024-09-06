// IMPLICIT TYPE CASTING

package Day2TypeCastOperator;

public class TemperatureConverterImplicit {

	public static void main(String[] args) {
		int celsius = 25; // temperature in celsius.

		// to convert celsius to fahrenheit formula.
		double fahrenheit = celsius * 9 / 5 + 32;
		System.out.println("Temperature in celsius : " + celsius);
		System.out.println("Temperature in fahrenheit : " + fahrenheit);
	}

}
