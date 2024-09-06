package Day2TypeCastOperator;

public class TemperatureConverterExplicit {

	public static void main(String[] args) {
		double fahrenheit = 77.0; // temperature in fahrenheit.

		// to convert fahrenheit to celsius formula.
		int celsius = (int) ((fahrenheit - 32) * 5 / 9);

		System.out.println("Temperatire in fahrenheit : " + fahrenheit);
		System.out.println("Temperature in celsius : " + celsius);

	}

}
