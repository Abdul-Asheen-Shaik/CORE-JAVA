package Day12Patterns;

public class Pattern7 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 26; j++) {       // ascii value of z is 122
				System.out.print((char) (122 - j) + " "); // 97 small a , 65 capital A
			}
			System.out.println();
		}

	}

}
